package Demos.Chapter07

import scala.collection.mutable
import scala.collection.parallel.CollectionConverters.ImmutableSeqIsParallelizable

object Scala17_Collection_test extends App {

  //todo 集合- 并行集合
  //不同地方的商品排行
  val list = List(
    ("Jayden", "Melbourne", "Shoe"),
    ("Leon", "Melbourne", "Clothes"),
    ("Henry", "Melbourne", "Shoe"),
    ("Jayden", "Sydney", "Hat"),
    ("Leon", "Sydney", "Shoe"),
    ("Henry", "Sydney", "Clothes"),
    ("Jayden", "Sydney", "Shoe"),
    ("Leon", "Melbourne", "Hat"),
    ("Henry", "Sydney", "Clothes"),
    ("Jayden", "Melbourne", "Shoe"),
    ("Leon", "Sydney", "Clothes"),
    ("Henry", "Melbourne", "Hat"),
    ("Jayden", "Sydney", "Shoe"),
    ("Leon", "Melbourne", "Hat"),
  )
  //1。将数据按照省份排行
  // Melbourne， Sydney
  val listGroupByPlace: Map[String, List[(String, String, String)]] = list.groupBy(
    t => {
      t._2
    }
  )
  println(listGroupByPlace)

  //2。同一地方，商品的点击数量统计一下
  val result = listGroupByPlace.view.mapValues(
    list=>{
      //获取商品信息
      val itemList= list.map(
        t=> {
          t._3
        }
      )
      //将相同商品进行分组
      val value:Map[String,List[String]] = itemList.groupBy(item => item)
      val map = value.view.mapValues(list => list.size).toMap
      //2。4 排序
      map.toList.sortBy(_._2)(Ordering.Int.reverse)
        }
      ).toList

  println(result)


}
