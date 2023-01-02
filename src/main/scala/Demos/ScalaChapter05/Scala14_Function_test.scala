package Demos.ScalaChapter05

import scala.math.Ordering.Boolean
import scala.util.control.Breaks
import scala.util.control.Breaks.*

object Scala14_Function_test {
  def main(args: Array[String]): Unit = {

    //todo 将简单版本的函数时编程恢复成完整代码
    //test（10，20，_+_) 30

    def test(x: Int, y: Int, f: (x: Int, y: Int) => Int): Int = {
      f(x, y)
    }

    def sum(x: Int, y: Int): Int = {
      x + y
    }

    println(test(20, 30,sum))

    //    test(10,20, _+_)

    //test1(_.substring(0,1))
    def fun1(name:String):String ={
      name.substring(0,1)
    }
    def test1 (f: String=>String):String ={
      f("Zhangsan")
    }
    println(fun1("Leon"))
    println(test1(fun1))

    // test2(_*2)
    def fun2(x:Int):Int ={
      x*2
    }
    def test2(f: Int => Int):Int ={
      f(10)
    }

    println(test2(fun2))

    //todo scala中字符串也有乘法的能力 (重复后拼接）
    val name = "Leon"
    val newName = name*2
    println(newName)

    //todo 控制抽象可以实现自定语法
    // 自定义while循环
//    while () {
//
//    }
  def myWhile(cond : => Boolean)(op: => Unit):Unit={
      if (cond) {
        op
        myWhile(cond)(op)
      }
    }
    val age=30
    myWhile(age == 30)(println("Age = 30"))//一直执行



  }
}
