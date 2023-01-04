package Demos.Chapter07

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection_ArrayBuffer_1 extends App {

  //todo 集合-可变数组
  //scala中绝对多数的集合对象都是通过apply方法构建出来

  val array = ArrayBuffer(1,2,3,4)
  val array1= Array(1,2,3,4)

  //将不可变变成可变
  val buffer =array1.toBuffer
  buffer.foreach(println)

  //将可变数组变成不可变数组
  val array2: Array[Int] = array.toArray







}
