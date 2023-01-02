package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala10_Object_Extends extends App {

  //todo Object oriented programming - 继承
  //1.存在父子类
  //2。主要目的是为了复用功能和属性
  //3. scala中类的继承和java中的继承是一样的，也是单继承，因为会产生歧义
  //      这种由于多继承所产生的歧义，称之为【钻石问题】
  //4。构造对象时，父类对象优于子类对象构建

//  val s= new Student() //返回person，student
//  val t = new Teacher(20) //返回person，student
//5。如果父类的构造方法存在参数，那么需要显示的调用父亲的构造方法并参数
//6. 构造方法存在访问权限，可以设定为私有的，如果放在class前面表面的是类是私有，不是方法私有，
//要放在参数前面private
//如果类构造方法私有化，那么如何构建对象
//1： 辅助构造方法可以使用
//2。 采用伴生对象

val p = Person.apply(28)

  class Person private(age:Int){
    var name:String = _
    println("person")

  }
  object Person{
    def apply(age: Int): Person = new Person(age)
  }
//  class Teacher (age:Int) extends Person(age) {
//    println("teacher")
//
//  }
//  class Student extends Person(30){
//    println("student")
//
//  }

}
