package Demos.Chapter07

import scala.collection.mutable

object Scala07_Collection_Map_1 extends App {

  //todo 集合-Map（映射，关联）
  //构建可变的Map集合
  val map = mutable.Map("a" -> 1,"a" -> 2,"a" -> 3)
  println(map)

  // todo 增删改查
  map.put("b", 4) //修改或者添加用put
  map.update("b", 5)

  map.put("a",5)
  map.update("c", 6) //新增

  map.remove("a") //删除a

//  map.clear()
  map.mkString(",")
  map.foreach(println)


  val iterator = map.keysIterator //key拿出来做迭代
  val valuesIterator = map.valuesIterator //value拿出来做迭代

  println(map)




}
