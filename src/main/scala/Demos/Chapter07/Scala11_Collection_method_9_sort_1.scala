package Demos.Chapter07

import Demos.ScalaChapter06.scala08_Object_Instance.User

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala11_Collection_method_9_sort_1 extends App {

  //todo 集合- 通用的方法-功能方法（函数）-sort

  //排序
  val user1= new User()
  val user2= new User()
  val user3= new User()
  user1.age=20
  user2.age=40
  user3.age=50

  val list= List(user1,user2,user3)
  val newList= list.sortBy(user =>user.age)(Ordering.Int.reverse)

  println(newList)


class User(){
  var age: Int= _

  override def toString: String = {
    s"User[${age}]"
  }
}

}
