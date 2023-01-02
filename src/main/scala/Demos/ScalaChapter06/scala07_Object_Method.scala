package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala07_Object_Method extends App {

  //todo Object oriented programming - method
  //类的方法其实就是类中声明的函数
  // 方法的生命周期是和类，对象相关
  //类中的函数遵循方法的约束: 函数不可以重名，方法可以重载，重写

  //todo 对象构建后，可直接使用的方法
  //1. Object类中的方法可以使用
  val user = new User()
  //2 scala中能用的方法
  user.eq (1) //内存地址比较
  println(user.isInstanceOf[User]) //查找类型
  val obj:Object = user.asInstanceOf[Object] //强制转换类型
  println(obj)



  class User{
    def test():Unit = {
      println("class test....")
    }

  }

  object User {
    def test(): Unit = {
      println("Object test....")
    }
  }
  new User().test() //class
  User.test() //object



}
