package Demos.ScalaChapter05

import scala.util.control.Breaks
import scala.util.control.Breaks.*

object Scala13_Function_lazy {
  def main(args: Array[String]): Unit = {
    //todo: lazy function
    //函数是否在调用时是否马上执行
    def test():String ={
      println("function....")
      "Leon"
    }
//    val a = test()// 先打印"function。。。"，然后将test的值返回给a，test的值为leon
//    println("__________") //打印"——————"
//    println(a) //打印a的值，即leon

    lazy val a = test() //表示只有用到结果的时候才执行, 所以并没有执行
    println("__________") // 先执行这个打印
    println(a) //在执行println("function....")和println"Leon"



  }

}
