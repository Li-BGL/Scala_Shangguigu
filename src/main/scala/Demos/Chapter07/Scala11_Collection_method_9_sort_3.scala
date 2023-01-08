package Demos.Chapter07

import Demos.ScalaChapter06.scala08_Object_Instance.User

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala11_Collection_method_9_sort_3 extends App {

  //todo 集合- 通用的方法-功能方法（函数）-sort

  //排序
  val user1= new User()
  val user2= new User()
  val user3= new User()
  val user4= new User()
  user1.age=20
  user2.age=40
  user3.age=50
  user4.age=40

  user1.money= 1000
  user2.money = 4000
  user3.money = 1500
  user4.money=2500

  //todo 先按照年龄排序，相同的年龄按照金额排序
  val list= List(user1,user2,user3,user4)
  val newList= list.sortBy(user=>user.money).sortBy(user =>user.age)
  //sortby 方法只是告诉集合排序的维度，但具体数据的排序过程是由集合本身完成
  //sortwith 方法来完成两个数据的大小判断，让集合根据判断结果进行排序
  //sortwith传递函数参数：（User，User）=》Boolean
  //user是集合中用于比较的两个user对象
  //boolean表示预计的排序结果的判断值，true预想，false不是预想的结果


  val newList1 = list.sortWith(
    (user1,user2) =>{
      if (user1.age<user2.age) {
        true
      }else if(user1.age == user2.age) {
        user1.money>user2.money
      }else {
        false
      }

    }
  )

  println(newList1)


class User(){
  var age: Int= _
  var money:Int=_

  override def toString: String = {
    s"User[${age},${money}]"
  }
}

}
