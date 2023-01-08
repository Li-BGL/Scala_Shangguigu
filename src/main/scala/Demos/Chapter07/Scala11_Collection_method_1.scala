package Demos.Chapter07

import scala.collection.mutable

object Scala11_Collection_method_1 extends App {

  //todo 集合- 同用的方法

  val list =List(1,2,1,3,4)
  //从集合中获取一部分数据
  println(list(0))
  println(list.head) //第一个
  println(list.tail) //不是最后一个。是除了第一个之外的其他几个

  println("tails=>" + list.tails) //迭代器

  println(list.last) //这是最后一个
  println(list.init) //除了最后一位的其他几位
//  println(list.inits)

  //从集合中获取指定个数的数据
  println(list.take(3)) //从左开始取3
  println(list.takeRight(3))//从右开始取3

  //删除数据
  println(list.drop(3))  //去掉左边三个
  println(list.dropRight(3)) //去掉右边三个，会产生新集合，本身list并没有变

  println(list.distinct) //去掉重复的
  println(list.reverse) //反转

  println(list.find(x => x % 2 == 0)) //true, Some, 2






}
