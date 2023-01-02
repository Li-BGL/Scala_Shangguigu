package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala14_Object_trait extends App {

  //todo Object oriented programming - 特质
  //scala中特质的语法，编译之后就是interface，但是理解的时候不要仅仅局限于interface
  //将特质（Trait）理解为interface和abstract class的结合体更好

  val user= new User()


//把trait理解为抽象类时，可以extends,trait Run extends Exception
//平时最好不要这么写
  trait Run {
    println("Trait")

  }

  class User extends Person with Run{
    println("user")

  }
  class Person{

  }







}
