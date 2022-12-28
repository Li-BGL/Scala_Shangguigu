package Demos.ScalaChapter05

object Scala07_Function_Hell_7 {
  def main(args: Array[String]): Unit = {
    //todo functional programming: hell version
    //1： 将函数对象作为变量赋值使用
    // 2：将函数对象作为参数使用
    //3： todo 也可以将函数对象作为返回结果返回
    //函数的返回值类型一般情况下不声明的，自动推断
//
//    def outer():()=>Unit ={
//      def inner():Unit={
//        println("Inner")
//      }
//      inner _
//    }
    //此时，f就是一个函数对象，有函数类型：()=>Unit
//    val f= outer()
//    f()
    //f就是outer(),f() = out()()
//    outer()()

    def outer1(x:Int) = {
      def middle (f: (Int,Int)=>Int) = {
        def inner (y:Int) = {
          f(x, y)
        }
        inner _
      }
      middle _
    }
    val middle = outer1(10)
    val inner = middle(_+_)
    val result = inner (20)
    println(result)
    println(outer1(10)(_+_)(26))
    println(outer1(10)(_ - _)(25))







  }
}
