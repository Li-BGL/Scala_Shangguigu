package Demos.ScalaChapter05

import scala.util.control.Breaks
import scala.util.control.Breaks.*


object Scala11_Function_Recursive {
  def main(args: Array[String]): Unit = {
    //todo functional programming: Recursive function
    //Recursive: 自己调用自己，左边有个小图标
    //递归函数应该有跳出递归的逻辑，否则会压栈，stackoverflow
    //recursive function needs to declare return type
    //todo java栈内存有大小限制的，方法执行时，压栈的内存也是有大小的，栈内存不能无限压栈
    //如果压栈的次数超过阈值，就会出错。scala采用了一种特殊语法优化递归操作：尾（伪）递归

//    def Recursive(n: Int): Int = {
//      if (n <= 1) 1
//      else n * Recursive(n - 1)
//    }
//
//    println(Recursive(5))

//1+3+5+7+9+...
//    def Odd(n:Int):Int ={
//      if (n<=1) 1
//      else n+Odd(n-2)
//    }
//    println(Odd(19))
//下面这种不行：Stackoverflow
//def test(): Unit = {
//  test()
//  println("test...")
//
//}
//下面可以，尾递归。但是会一直运行下去，不好
  def test():Unit = {
    println("test...")
    test()
}
    test()
  }
}
