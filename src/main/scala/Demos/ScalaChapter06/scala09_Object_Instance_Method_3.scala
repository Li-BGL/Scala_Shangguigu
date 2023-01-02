package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala09_Object_Instance_Method_3 extends App {

  //todo Object oriented programming - 对象的构造方法
  //构造方法为什么要传参数？
  //将类的外部数据传递到类的内部，实现数据的赋值，给类的属性赋值
  //scala为了开发方便，可以在构造参数前增加var，val，让参数作为类的属性存在
  val user = new User("Leon")
  println(user.name)

  class User(var name: String) {

  }
}
