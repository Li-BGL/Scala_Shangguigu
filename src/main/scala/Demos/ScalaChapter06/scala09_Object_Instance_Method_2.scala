package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala09_Object_Instance_Method_2 extends App {

  //todo Object oriented programming - 对象的构造方法
  //java中的构造方法可以重载
  //scala中的构造方法如何重载？
  //todo scala中的构造方法分为两大类：
  //1。 主构造方法：完成类的初始化
  //2。辅助构造方法：在类的初始化后，完成类的辅助功能，属性赋值
  //             辅助构造方法必须直接或者间接的调用主构造方法
  //            辅助构造方法有重载概念，但是主构造方法没有
  // 辅助构造方法用this关键字声明
  //多恶搞辅助构造方法在调用时，需要提前声明


  val user2= new User("Leon", 8)



// 先调用主构造函数，所以11111和33333先调用，然后才是22222
//class User() {
//  println("11111")
//  def this(name:String)= {
//    this()
//    println("22222")
//  }
//  println("33333")
//}

//下面这个是间接调用主构造函数
//执行顺序：11111，3333，22222，4444
  class User() {
    println("11111")

    def this(name: String) = {
      this()
      println("22222")
    }

    def this(name: String, age: Int) = {
      this(name)
      println("444444")
    }

    println("33333")

  }

}
