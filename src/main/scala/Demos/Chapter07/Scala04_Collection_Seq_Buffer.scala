package Demos.Chapter07

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object Scala04_Collection_Seq_Buffer extends App {

  //todo 集合-Seq(序列）
  //scala 中所有的集合有可变和不可变两个版本
  //1。Seq，List 不可变
  //2。ListBuffer => 可变 Seq没有buffer，都采用ListBuffer

  val listBuffer = ListBuffer(1,2,3,4)
  val listBuffer2 = ListBuffer(1,2,3,4)

  println(listBuffer.append(5)) //1,2,3,4,5
  println(listBuffer.appendAll(listBuffer2)) //1,2,3,4,5,1,2,3,4
  listBuffer.insert(0,3) //return Unit
  println(listBuffer) //3,1,2,3,4,5,1,2,3,4
  listBuffer.update(0,8) //8,1,2,3,4,5,1,2,3,4
  println(listBuffer)
  listBuffer.remove(0) //1,2,3,4,5,1,2,3,4
  println(listBuffer)
  listBuffer.remove(0,3) //4,5,1,2,3,4
  println(listBuffer)







}
