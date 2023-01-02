package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala13_Object_interface extends App {

  //todo Object oriented programming - 接口
  //什么是接口？scala中没有接口的概念。scala可以将多个对象中相同的特征从对象中剥离出来
  //形成一个独立的语法结构，称之为特质，如果一个对象符合这个特征，那么可以将特质混入到这个对象
  //这个特质就叫trait，猫，狗都会跑，那就把这个跑叫做特质，但是每个跑的不一样，所以具体怎么跑不知道

  //向类中混入特质，有两种方法：
  //1。如果存在父类，那么采用with
  //2。如果没有父类，那么可以直接extends来混入
  //3。 如果需要混入多个特质，那么第一个采用extends，后面采用with
  //trait
  val cat = new Cat()
  cat.run()

// 特质的本质就是interface，编译之后字节码就是interface
  trait Run{
    def run():Unit
  }
  class Cat extends Run {
    override def run(): Unit = {
      println("cat run")
    }
  }
  class Person{

  }
  class User extends Person with Run{
    override def run(): Unit = {
      println("User run")
    }
  }









}
