package Demos.Chapter10

object Scala03_Transform extends App {
  //todo 隐式转换- 二次编译
  implicit def transform(d:Double):Int={
    d.toInt
  }

  val i:Int =10.5
  //如果直接在10。5后面加toInt，违背了ocp原则
  //增加implicit 函数
  //如果在作用域中存在两个相同的转换规则，那么转换不起作用




}
