package Demos.Chapter07

import scala.collection.mutable

object Scala11_Collection_method extends App {

  //todo 集合- 同用的方法
  //mkString
  val list =List(1,2,1,3,4)

  println(list.length)
  println(list.size)
  println(list.isEmpty)
  println(list.contains(2))
  println(list.reverse) //反转集合，4，3，2，1
  println(list.distinct) //集合去重复
  println(list.mkString(" ")) //生成字符串
  list.foreach(println)





}
