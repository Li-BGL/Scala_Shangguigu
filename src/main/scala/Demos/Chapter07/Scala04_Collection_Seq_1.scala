package Demos.Chapter07

import scala.collection.mutable.ArrayBuffer

object Scala04_Collection_Seq_1 extends App {

  //todo 集合-Seq(序列）-List
  //Seq所表示的有序的概念，说的是数据的插入顺序，不是大小顺序
  val list = List(1,4,3,2)
  println(list)

  //seq所表示的数据可重复的概念
  val list1 = List(1,1,1,1,1)
  println(list1) //List(1,1,1,1,1)
  
  //todo 基本数据操作
  //Seq, List集合默认使用时，就是不可变的，所以常用的数据操作方法其实都是特殊符号
  //默认情况下，不可变的集合的数据操作，会产生新的集合
  val list2 = List(1,2,3,4)
  val list3 = List(5,6,7,8)
  println(list.+: (5)) //5,1,4,3,2
  println(list.:+ (5)) //1,4,3,2,5
  println(list.++:(list2)) //List(1, 2, 3, 4, 1, 4, 3, 2)
  val list4=List.concat(list,list2)//List(1, 4, 3, 2, 1, 2, 3, 4)
  println(list4)
  val list5 = list1.updated(0,6) //产生新的集合
  println(list5)
  println(list2.mkString(",")) // 1,2,3,4
  list3.foreach(println)







}
