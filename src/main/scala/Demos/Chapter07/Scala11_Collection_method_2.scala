package Demos.Chapter07

import scala.collection.mutable

object Scala11_Collection_method_2 extends App {

  //todo 集合- 通用的方法 - 会产生新的集合

  val list= List(1,2,3,4)
  println(list.splitAt(2))

  //获取每连续的两条数据，1，2，3，4，5，6，取出来的是（1，2） （2，3）（3，4）（4，5），（5，6）
  println(list.sliding(2))

//  private val tails: Iterator[List[Int]] = list.tails
//  while(tails.hasNext){
//    println(tails.next().take(2))
//  }
// sliding 方法可以将集合中的一部分固定数量的数据作为整体进行数据处理
//处理完以后，作为整体的操作会向后滑动，整体的数量不会发生改变，但是起始位置会发生改变
// 将这个整体的数据范围称之为窗口，而这个窗口会跟随计算进行滑动，称之为滑动窗口
  private val value: Iterator[List[Int]] = list.sliding(2)
  while (value.hasNext){
    println(value.next())
  }
  //（1，2） （2，3）（3，4）

  //如果需要两个两个滑动，sliding（2，2）
  private val value2: Iterator[List[Int]] = list.sliding(2,2)
  while (value2.hasNext) {
    println(value2.next())
  }
  //(1,2),(3,4)

//  println(list.take(2))
//  println(list.tail.take(2))
//  println(list.tail.tail.take(2))







}
