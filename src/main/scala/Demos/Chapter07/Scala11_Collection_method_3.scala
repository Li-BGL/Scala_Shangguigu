package Demos.Chapter07

import scala.collection.mutable

object Scala11_Collection_method_3 extends App {

  //todo 集合- 通用的方法 - 会产生新的集合
  val list1 = List(1,2,3,4)
  val list2 = List(3,4,5,6)

  val set1 = Set(1, 2, 3, 4,5,6)
  val set2 = Set (3, 4, 5, 6,7,8)

  //数据集的交集，
  println(list1.intersect(list2)) //3,4
  println(set1.intersect(set2))
  //并集 1,2,3,4,3,4,5,6
  println(list1.union(list2))
  println(set1.union(set2))
//，差集 1,2
  println(list1.diff(list2))
  println(set1.diff(set2))

  //拉链：将两个数据集拉在一起
  //基本原则：将两个数据集中相同位置的数据拉在一起
  //如果两个数据集的长短不一样，以短的
  //List((1,3), (2,4), (3,5), (4,6))
  println(list1.zip(list2).toMap)
  println(set1.zip(set2).toMap) //数据被打乱了，因为set无序





}
