package Demos.ScalaChapter05

object Scala02_Function {
  def main(args: Array[String]): Unit = {

    //Todo function vs method
    //函数可以声明在任意位置，方法只能在类中

    def test(): Unit = {
      println("Test function")
    }
    //if 函数名称和方法名称相同，默认情况调用函数。如果没有函数，会调用方法
    //test
    this.test2()//函数是独立调用，如果是基于对象，那就是方法
  }

  def test2(): Unit = {
    println("Test method")
  }
  test2()


}
