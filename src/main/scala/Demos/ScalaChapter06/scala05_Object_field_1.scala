package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala05_Object_field_1 extends App {

  //todo Object oriented programming
//val 声明类的属性，编译时会给属性增加final关键字
//类的属性在编译时，都是private权限，会同时生成属性公共的set get方法，但是名字中不是以setget开头
//当访问属性时，等同于调用对象的属性的get方法
//当给属性赋值时，等同于调用对象的属性的set方法
//java中bean对象有bean开发规范
//属性私有化，提供公共的set get方法，方法以set，get开头
//scala中对象属性不遵循bean规范，这样，和其他技术框架集成时，会出现很多问题
//所以为了能够和其他框架集成，scala提供了一个注解，解决bean规范的问题


  class User {
    @BeanProperty var name: String = "Leon"
    val age: Int = 8
   @BeanProperty private var age2:Int = _ //private不能加注解


    var email:String = _
  }
  val user=new User()
  //user.getName() 加了beanproperty后就可以用了
  //user.setName()
  user.name= "Jayden"
//  user.age2 = 40 // age2 is private，编译时set，get也是private

  println(user.name)



}
