package Demos.Chapter07

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object Scala04_Collection_Seq_Buffer_1 extends App {

  //todo 集合-Seq(序列）
  val list =List(1,2,3,4)
  val buffer = ListBuffer(1,2,3,4)
  //互相转化
  val buffer1 = list.toBuffer
  val list1 = buffer.toList







}
