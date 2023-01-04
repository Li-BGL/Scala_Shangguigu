package Demos.Chapter07

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection_ArrayBuffer extends App {

  //todo 集合-可变数组
  val array = new ArrayBuffer[Int]()
  val array1 = Array (5,6,7,8)

  //增加数据
  array.append(1,2,3,4) //追加
//  array.appendAll(array1)

//scala中自定义的集合类型打印后可以直接出现数据

  println(array)
  array.insert(0,5) //在0的位置插入5，所以就成了5，1，2，3，4
  println(array)

  //修改 update
  array.update(3,8)
  println(array) //5,1,2,8,4

  val arrayNew = array.updated(3,7)
  println(arrayNew) //updated是创建了新的数组
  //删除 remove
  array.remove(1)
  println(array) //5,2,8,4
  array.remove(0,2) //8,4
  println(array) //
  array.remove(0,2)
  println(array) //全删掉了

  array.append(1,2,3,4)
  println(array)

  //查询
  array.mkString(",")
  array.foreach(println)
  println(array.apply(0))//查询0位置的值
  array(0)








}
