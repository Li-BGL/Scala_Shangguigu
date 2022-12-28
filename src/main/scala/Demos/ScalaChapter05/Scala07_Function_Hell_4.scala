package Demos.ScalaChapter05

object Scala07_Function_Hell_4 {
  def main(args: Array[String]): Unit = {
    //todo functional programming: hell version

    //
    def test(f: (Int,Int) => Int): Unit ={
      val result = f(10,20)
      println(result)
    }

    def sum(x:Int,y:Int): Int = {
      x+y
    }

    def diff(x: Int, y: Int): Int = {
      x - y
    }
//    val f:Int = sum(10,20)
//    println(f)

    //todo 下划线的省略
    // 将函数对象作为参数使用，就类似于将逻辑进行传递，意味着逻辑可以不用写死了
    //将函数名称直接作为参数传递给另外一个函数此时不需要使用下划线
    //使用下划线的目的是不让函数执行，而是将它作为对象使用，如果能明确知道函数不执行，就用_
    test(sum)
    test(diff)

    //todo 名称真的那么重要吗？
    //如果将函数对象作为参数使用时，那么参数名称很重要，因为调用时使用的就是参数名称




  }
}
