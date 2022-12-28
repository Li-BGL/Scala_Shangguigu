package Demos.ScalaChapter05

object Scala07_Function_Hell_2 {
  def main(args: Array[String]): Unit = {
    //todo functional programming: hell version
    def test():Unit = {
      println("test...")
    }
   //将函数对象赋值给一个变量，那么这个变量其实就是函数
   //既然这个变量就是函数，这个变量可以传参数执行
   val f = test _
    f()


  }
}
