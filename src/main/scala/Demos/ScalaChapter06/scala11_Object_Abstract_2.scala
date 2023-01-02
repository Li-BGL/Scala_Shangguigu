package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala11_Object_Abstract_2 extends App {

  //todo Object oriented programming - 抽象属性
  //如果类的属性只有声明，没有初始化，就称之为抽象属性，因为不完整
  //属性是类的一部分，部分不完整，那么整体也就不完整，所以类应该为抽象类
  //如果想要构建类，需要通过子类进行构建，并且将不完整属性补充完整

  //todo 抽象属性的本质
  //1。编译器再编译时，抽象属性并不会编译为属性，而是会编译为属性对应的set get两个抽象方法
  //2。子类在编译时，其实就是实现了属性的set get方法
  //3。 本质上属性的抽象还是方法的抽象
  //4。完整的属性在scala中有重写的概念，本质上还是方法的重写

  val user = new child()
  println(user.age)

  abstract class User{
    var name:String
    val age: Int = 30
  }

  class child extends User{
    var name:String ="Leon"
    override val age:Int = 40 //add override

  }


}
