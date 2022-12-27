package Demos.ScalaChapter03

import scala.language.postfixOps

object Operation_2 extends App {

  val name: String = "Leon"
  var age: Int = 10
  age += 1
  println("age is: " + age)
  val age2= age + 1
  println("Age is: " + age2)
//  age= age ++
//    println(age)
  //factorial 阶乘
def test(n:Int): Int={
  if (n<=1) 1
  else n*test(n-1)
}
  println(test(5))
  println(test(1))

def isNotEmpty(s: String): Boolean = {
  if (s.isEmpty || s.trim().equals("")) false
  else true
}
  println(isNotEmpty("  "))
  println(isNotEmpty("Leon"))

  //TODO operations are actually methods, and numbers are objects
  //简化了的对象和方法调用

  val r= 1.+(1)
  println(r)
  val r2 = 1 + 1
  println(r2)
  val s1 = new String("123")
  val s2 = new String("123")
  println(s1.equals(s2))
  println(s1 equals s2)
  val i=10
  println(i.toString)
  println(i toString)







}
