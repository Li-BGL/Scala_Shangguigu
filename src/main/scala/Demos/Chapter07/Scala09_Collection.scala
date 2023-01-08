package Demos.Chapter07

import scala.collection.mutable

object Scala09_Collection extends App {

  //todo 集合


  //todo:list=> Array,Set
  val list= List(1,2,1,2)
  val array: Array[Int] = list.toArray
  val set: Set[Int] = list.toSet

  println(array.mkString(","))
  println(set)

  //Todo Set=> Array,List
  val set2 = Set(1,2,3,4)
  val array1: Array[Int] = set2.toArray
  val list1: List[Int] = set2.toList
  println(array1.mkString(","))
  println(list1)
  println(set2)

  //todo Map
  val map = Map(
    ("a",1),("b",2),("c",3)
  )
  val array2: Array[(String, Int)] = map.toArray
  val list2: List[(String, Int)] = map.toList
  val set1: Set[(String, Int)] = map.toSet
  println(array2.mkString(","))
  println(list2)
  println(set1)










}
