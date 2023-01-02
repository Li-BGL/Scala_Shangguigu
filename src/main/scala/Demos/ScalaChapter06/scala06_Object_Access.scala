package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala06_Object_Access {
  def main(args: Array[String]): Unit = {
    //todo Object oriented programming
    //todo scala 访问权限和java类似，也有四种不同权限
    //1。private： 私有，同类
    //2。private【包名】：私有，同类，同包，子包也可以用
    //3。 protected：受保护的，同类同包，子类
    //4。default：公共的，任何地方可以用



  }

  class User {
    private var name: String = "Leon"
    private[ScalaChapter06] var age: Int = 8
    protected var email: String = "dafag"
    var address: String = "52 old orchard drive"

    def test(): Unit = {
      println(this.name)
      println(this.age)
      println(this.email)
      println(this.address)
    }
  }

  class Emp {

    def test(): Unit = {
      val user = new User
      //        println(user.name)
      println(user.age)
      //        println(user.email)
      println(user.address)
    }

  }
  class Student extends User {
    def test1():Unit={
//      println(this.name)
      println(this.age)
      println(this.email)
      //email 本身是protected，但是??
      println(this.address)
    }
  }

}

package subChapter06{
  import Demos.ScalaChapter06.scala06_Object_Access.User
  //子类，
  class subclass {
    def test(): Unit = {
      val user = new User
//      println(user.name)
      println(user.age)
//      println(user.email)
      println(user.address)
    }
  }

}