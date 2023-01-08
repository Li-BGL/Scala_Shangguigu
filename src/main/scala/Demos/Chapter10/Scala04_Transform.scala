package Demos.Chapter10

object Scala04_Transform extends App {
  //todo 隐式转换- 二次编译
  //implicit 隐式函数
  implicit def transform(d:Double):Int={
    d.toInt
  }

  val i:Int =10.5




}
