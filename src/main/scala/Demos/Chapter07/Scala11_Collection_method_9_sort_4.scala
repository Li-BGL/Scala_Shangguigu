package Demos.Chapter07

import Demos.ScalaChapter06.scala08_Object_Instance.User

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala11_Collection_method_9_sort_4 extends App {

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


  //todo 如果scala中的排序的规则如下：
  //先按照第一个数据排序，如果数据相同，在按照第二个排序，如果数据相同，在按照第三个
  //可以采用特殊的方法排序：tuple排序
  //默认情况下，蔡徐升序排列，如果想要降序，需要传递第二个参数
  val newList= list.sortBy(
    user =>{
      (user.age,user.money)
    }
  )(Ordering.Tuple2(Ordering.Int,Ordering.Int.reverse))
  println(newList)

class User(){
  var age: Int= _
  var money:Int=_

  override def toString: String = {
    s"User[${age},${money}]"
  }
}

}
