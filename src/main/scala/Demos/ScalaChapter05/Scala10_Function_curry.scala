package Demos.ScalaChapter05

import scala.util.control.Breaks
import scala.util.control.Breaks.*


object Scala10_Function_curry {
  def main(args: Array[String]): Unit = {
    //todo functional programming: curry

//    def test(a:Int,b:Int):Unit={
//      for (i<- 1 to a){
//        println(i)
//      }
//      for(i<- 1 to b){
//        println(i)
//      }
//    }
//    val a=10
//    val b=20
//    test(10,20)
// 函数的参数之间可能没有关系，那么如果在船只的时候，同时传递，其实就有耦合性
//而且增加调用难度，不能光给a，还要b才能执行
//curry将无关参数分解开，设定多个参数列表
def test1(a: Int)(b: Int): Unit = {
  for (i <- 1 to a) {
    println(i)
  }
  for (i <- 1 to b) {
    println(i)
  }
}
    val part1 = test1(10)//可以只传一个值


    test1(10)(20)

  }
}
