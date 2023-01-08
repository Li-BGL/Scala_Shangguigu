package Demos.Chapter07

import Demos.ScalaChapter06.scala08_Object_Instance.User

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala11_Collection_method_9_sort_2 extends App {

  //todo 集合- 通用的方法-功能方法（函数）-sort

  val dataMap=Map(
    ("a",1),("b",2),("c",3)
  )
  //map方法将数据集中的每一条数据进行转换处理，返回新集合
  //执行map方法前，集合的数据类型是可以明确知道的
  //map集合中的每一条数据就是kv键值对，kv键值对就是元组（对偶）



class User(){
  var age: Int= _

  override def toString: String = {
    s"User[${age}]"
  }
}

}
