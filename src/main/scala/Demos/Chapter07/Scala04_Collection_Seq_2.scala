package Demos.Chapter07

import scala.collection.mutable.ArrayBuffer

object Scala04_Collection_Seq_2 extends App {

  //todo 集合-Seq(序列）-List
  val list = List(1,2,3,4)

  //使用不同的方式构建集合
  //::这个运算符表示向集合中添加数据，但是因为冒号结尾，所以是从后往前加
  val list1 = 1::2::3::4::List()
  List().::(4).::(3).::(2).::(1)
  println(list1) // 1,2,3,4
  //如果直接使用List()，表示空集合，向空集合添加数据，通常采用下面那种方式::
  //所以可以采用特殊符号Nil来代替
  val list2 = 1::2::3::4::Nil
  println(list2) //和前面是一样的，1，2，3，4

  val list3 = 9::list2:::list1 //三个冒号表示把集合添加进来
  println(list3) //9,1,2,3,4,1,2,3,4
  val list4 = 9::list2:: list1
  println(list4) //List(9, List(1, 2, 3, 4), 1, 2, 3, 4)

  println(list3.length) //9
  println(list4.length) //6







}
