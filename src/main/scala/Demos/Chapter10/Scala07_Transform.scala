package Demos.Chapter10

import sun.security.util.Password

object Scala07_Transform extends App{
  //todo 隐式转换- 二次编译
  //1.当前类的内部
  //    隐式转换不能应用于最外层的对象

  //2。 隐式转换规则必须和当前类有关系，才方便查找
  //    父类，父类的伴生对象可以
  //    trait和trait的伴生对象也可
  //3。 包对象 也可以，package class
  //4。从其他package直接导入import
  // Predef里面有很多implicit function，不需要导入就可以转换


  val user = new User()
  user.insertUser()
  user.updateUser()


  implicit class UserExt(user:User){
    def updateUser(): Unit = {
      println("update user....")
    }
  }

  class User{
    def insertUser(): Unit={
      println("insert user....")
    }

  }


}
