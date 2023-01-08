package Demos.Chapter10

object Scala01_Transform extends App {
  //todo 隐式转换
  //所谓的隐式转换，其实就是类型转换

  //1。两个数据类型之间如果想要转换，那么必须类型之间有关系，父子类，接口，实现类的关系
  //  byte和int类型之间没有关系，所以不应该能转换
  //但是scala底层实现了自动转化implicit def ByteToInt
  val b:Byte =10
  val i:Int=b
  println(i)

  //2。 scala中没有字符串，使用的时候就是java的字符串
  //   java 中的字符串是一个类，没有小括号访问的方式
  //String=>StringOps(implicit)
  val s= "hello"
  val ss= s(0).toUpper+s.substring(1)
  println(ss)

  //程序允许扩展功能，但是应该对修改改变，ocp开发原则
  val user = new User() with update
  user.insertUser()
  user.updateUser()

  trait update {
    def updateUser(): Unit = {
      println("update user....")
    }

  }
  class User{
    def insertUser():Unit={
      println("insert user....")
    }
  }

}
