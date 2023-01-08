package Demos.Chapter07

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala11_Collection_method_4 extends App {

  //todo 集合- 通用的方法
  val list1 = List(1,2,3,4)
  //list(2,4,6,8)
  //想要实现一个不确定的功能，但是这个功能的主要目的是将数据集中的每一条数据进行处理后
  //返回新的集合，但是这个处理的逻辑是不确定的
//List=> logic => List
//scala集合提供了可以进行自动转化的操作，具体的转换逻辑由开发人员提供

  def test(num: Int): Int ={
    num*2
  }

  println(transform(list1, test))



  def transform(list:List[Int],f : (Int)=>Int):List[Int] ={
    val newList= ListBuffer[Int]()
    list.foreach (
      num => {
        val result = f(num)
        newList.append(result)
      }
    )
    newList.toList
  }

  //todo map方法就是用于将数据集合的每一条数据进行转换，获取转换后的新的数据集
  // List => map(logic) = > List

  println(list1.map(_ * 3))


}
