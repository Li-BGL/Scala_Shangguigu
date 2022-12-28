package Demos.ScalaChapter05

import scala.util.control.Breaks
import scala.util.control.Breaks.*


object Scala09_Function_closure {
  def main(args: Array[String]): Unit = {
    //todo functional programming: closure
    //闭包使用的是改变函数的声明来实现的

    def outer(a:Int) ={
      def inner(b:Int) = {
        a+b
      }
      inner _
    }
    val inner = outer(10)
    println(inner(20))

    val name="Leon"

    def test():Unit={
      println(name)
    }
    //这个没有闭包

    val f=test _ //test as object
    f()

    //这时候就有闭包

    //todo 总结： 闭包的场景
    //1。内部函数使用了外部的数据，改变数据的生命周期
    //2。将函数作为对象使用，改变函数本身的生命周期
    //3。 所有匿名函数都有闭包
    //4。 内部函数返回到外使用会有闭包




  }
}
