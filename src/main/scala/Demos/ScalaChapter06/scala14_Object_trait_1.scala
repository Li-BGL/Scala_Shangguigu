package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala14_Object_trait_1 extends App {

  //todo Object oriented programming - 特质
  //java中所有的接口在scala中使用都是当成特质来用的
  //特质的用法
  //todo 开发程序要遵循相应的开发原则
  //OCP原则： open close
  //开发程序代码时，应该对功能的扩展开放（open）
  //开发程序代码时，应该对功能的修改关闭（close）
  val user = new User() with update
  user.insertUser()
  user.updateUser()

  trait update{
    def updateUser(): Unit = {
      println("update user...")
    }

  }

  class User {
    def insertUser(): Unit = {
      println("insert user...")
    }


  }


  //  class User{
//    def insertUser():Unit={
//      println("insert user...")
//    }
//
//    def updateUser(): Unit = {
//      println("update user...")
//    }
//  }





}
