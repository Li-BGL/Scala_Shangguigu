package Demos.Chapter10

import sun.security.util.Password

object Scala06_Transform extends App {
  //todo 隐式转换- 二次编译
//
//  implicit def transform(user: User):UserExt ={
//    new UserExt
//
//  }
  //增加上面的transform函数就可以了 class+function
  //也可以在下面的userext类里增加user：User，前面加implicit也可
  //如果类的前面增加implicit关键字，表示当前类应用于隐式转换，称之为隐式类


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
