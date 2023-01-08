package Demos.Chapter07

import Demos.ScalaChapter06.scala08_Object_Instance.User

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.Source

object Scala13_Collection_method_wordcount extends App {

  //todo 集合- 使用功能函数实现word count
  val list = List(
    ("Hello World Scala Park",4),
    ("Hello World Scala",3),
    ("Hello World",2),
    ("Hello",1),
  )

    //将现有数据转换成熟悉的数据格式
    //turple=》line

  val top3 = list.map(
    kv => {
      (kv._1 + " ") * kv._2
    }
  ).flatMap(_.split(" "))
    .map((_, 1))
    .groupBy(_._1)
    .view.mapValues(_.size)
    .toList.sortBy(_._2)(Ordering.Int.reverse)
    .take(3)

  println(top3)



}
