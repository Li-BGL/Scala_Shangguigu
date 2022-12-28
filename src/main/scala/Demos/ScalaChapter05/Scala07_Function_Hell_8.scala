package Demos.ScalaChapter05

object Scala07_Function_Hell_8 {
  def main(args: Array[String]): Unit = {
    //todo functional programming: hell version
    //todo 如果一个函数使用了外部的变量，但是改变这个变量的生命周期
    //将变量包含的当前函数的作用域内，形成闭合的效果，这个环境叫做闭包
    //todo 简称（闭包）

    def outer(x:Int) ={
      def inner(y: Int) ={
        x+y
      }
      inner _
    }

    println(outer(10)(20))






  }
}
