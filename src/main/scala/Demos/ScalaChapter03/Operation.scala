package Demos.ScalaChapter03

object Operation extends App {
  println(10 > 20)
  println( 11 == 11)
  val name1 = "123"
  val name2 = "456"
  println(name1 == name2)
  // == 可以理解为比较值
  val name3 = new String("123")
  val name4 = new String("123")
  println(name3 == name4) //true，在java中是false，在scala中是true，scala中双等号是非空equals操作
  println(name1 == name3)
  println(name1.equals(name3))
  val name5: String = null
  println(name3 == name5)
  //if 比较对象的内存地址，需要采用eq方法
  println(name3 eq name4)
  val a:String = "hello"
  println(a.capitalize)


}
