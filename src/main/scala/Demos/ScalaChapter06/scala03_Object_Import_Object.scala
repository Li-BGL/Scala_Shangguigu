package Demos.ScalaChapter06

import java.util
import javax.xml.crypto.Data
import scala.collection.mutable

object scala03_Object_Import_Object extends App {

  //todo Object oriented programming
  //todo java：
  //引入对象
  //println方法我们从来没声明过，但是可以直接使用
  println("Leon")

  //println 来自于object Predef
  //scala中默认导入了predef对象，类似于静态导入
  //scala中使用object声明的对象其实模拟静态语法，但是本质上是一个对象
  //使用其实这里就是导入对象
  //导入对象的所有内容import user._

  val user= new User()
  import user. _
  test()  //这里就不需要写user。test（），但是必须是val声明，不是var


//  user.test()


  class User{
    def test():Unit={
      println("User test....")
    }
  }







}
