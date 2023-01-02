package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala12_Object_object extends App {

  //todo Object oriented programming - object
  //object声明的是类，也同时是伴生对象
  //apply方法可以用于构建对象，但是不仅仅用于构建对象
  //apply方法可以背编译器动态识别，所以可以省略
  val user1 = new User() //构造对象实例，此处代码执行的是类的构造方法，实现对象初始化 法、返回user
 println("。。。。。")
  val user2 = User //直接访问类名，其实访问的不是类，而是类的伴生对象 不返回
  println("。。。。。")
  val user3 = User.apply() //apply 方法主要用于构建对象 返回user apply和user
  println("。。。。。")
  val user4 = User() //与上面一样
  class User {
    println("user")
  }
  object User{
    def apply():User = {
      println("user apply")
      new User
    }
  }


}
