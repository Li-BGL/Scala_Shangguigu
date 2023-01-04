package Demos.Chapter07

import scala.collection.mutable

object Scala08_Collection_turple_1 extends App {

  //todo 集合-Tuple
  //Tuple如果采用集合类型表示，麻烦，可以采用简化版本

  val t: Tuple3[Int,String,Int] = (1,"Leon",30)
  val t2: (Int,String,Int) = (1,"Leon",30)

  //tuple元素的访问
  //无法使用循环操作，因为数据之间没有关系，就不能采用相同的循环逻辑

  //如果想要访问其中的数据，可以采用顺序号
  println(t2._1)
  println(t2._2)
  println(t2._3)

  println(t2.productElement(0))// 索引的方式，返回1





  








}
