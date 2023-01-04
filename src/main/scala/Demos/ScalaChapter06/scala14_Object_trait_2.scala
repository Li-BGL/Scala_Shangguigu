package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala14_Object_trait_2 extends App {

  //todo Object oriented programming - 特质执行顺序
  //1.把trait当作为抽象类，所以trait的初始化应该优于当前类
  val user = new User()
  //2. 如果类同时有父类和特质，那么父类初始化优先，parent》trait》current class
  //3。如果类同时有多个特质，从左到右依次初始化
  //4。如果父类和子类都有特质parent trait》parent class》current trait》current class
  //5。同一个构建过程中，初始化只会执行一次

  trait myTrait{
    println("111111")
  }

  trait myTrait1 {
    println("444444")
  }
  class Parent extends myTrait1 {
    println("222222")

  }
  class User extends Parent with myTrait with myTrait1 {
    println("333333")
  }






}
