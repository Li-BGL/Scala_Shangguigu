package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala09_Object_Instance_Method extends App {

  //todo Object oriented programming - 对象的构造方法

  //1. java中类的构造方法默认由JVM提供：无参，公共的
//   val user = new User()

  //2. scala中类的构造方法默认由jvm提供，午餐，公共的，小括号可以省略
//   val user1= new User

  //3. 如果开发人员给类提供了构造方法（任意），jvm不会提供默认构造方法
  //4。 new 构造对象时，应该执行构造方法
  //5。 java中构造方法和类的名称是一致的，但scala中构造方法和类的名称没有关系
//  user1.User()
  //6. scala中是完全面向函数式编程，所以万物皆函数，声明类就等同于声明函数
  // 声明类的同时所声明的函数其实就是构造函数，当new的时候，函数会执行，所以上面new了两次，会
  // 执行两次 println
  //7。scala的构造函数主要功能就是类的实体化（类主体内容的执行）
  //8。 构造方法可以传递参数 name：String
  val user2= new User("Leon")




class User(name: String) {
  //类的主体&构造函数体
  println("user instance.......")
  def User() = {
    println("User instance....")
  }

}

}
