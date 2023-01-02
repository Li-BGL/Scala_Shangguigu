package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala08_Object_Instance extends App {

  //todo Object oriented programming - Instance

  //1。 new来构建对象
  val user = new User()
  println(user) //返回内存地址，使用是对象
  //2。可以通过反射构建对象

  //3。 clone
  //4。 反序列化
  //scala中可以使用object构建单例对象

  //scala中有一个方法可以构建对象，实际上采用的就是new，但是编译器可以动态识别
  val user1 = User.apply()
  val user2= User()
  println(user1)
  println(user2)

  class User{

  }
  object User{
    def apply():User = new User()
  }




}
