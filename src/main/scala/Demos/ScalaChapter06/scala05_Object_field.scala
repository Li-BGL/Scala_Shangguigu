package Demos.ScalaChapter06

object scala05_Object_field extends App {

  //todo Object oriented programming
  //1. scala中给类声明属性等同于给类声明变量
  // 类中的变量称之为属性
  //2. 变量使用var，val
  //3。变量的类型如果可以推断出来，可以省略
  //4。变量必须显示的初始化 不可以val age 而没有初始化
  //java中属性可以默认初始化的，所以属性赋值可以不用写
  //scala中属性必须明确初始化，但是也希望和java保持一致
  //可以采用下划线进行赋值，表示由系统默认初始化, 但是属性类型不能省略
  //下划线只能给var，不能给val，因为val不能改
  class User {
    var name: String = "Leon"
    val age: Int = 8
    var email:String = _
  }
  val user=new User()
  println(user.name)



}
