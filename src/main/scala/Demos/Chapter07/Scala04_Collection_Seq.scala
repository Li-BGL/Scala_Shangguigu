package Demos.Chapter07

import scala.collection.mutable.ArrayBuffer

object Scala04_Collection_Seq extends App {

  //todo 集合-Seq(序列）
  //scala集合中的seq表示就是 有序，数据可重复的数据集合
  //todo 构建
  //1。seq集合需要指定范型.seq是一个trait，所以无法直接构建对象，一般采用伴生对象的apply方法
  //下面这个语句不work： val seq = new Seq[Int]()
  //seq无法直接构建对象，底层采用的是list集合
  val seq: Seq[Int] = Seq.apply(1, 2, 3, 4)
  val seq2 = Seq(5,6,7,8)

  println(seq) //打印出来实际上是个list List(1, 2, 3, 4)
  println(seq2)





}
