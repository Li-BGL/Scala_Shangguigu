package Demos.ScalaChapter05

object Scala07_Function_Hell_9 {
  def main(args: Array[String]): Unit = {
    //todo functional programming: hell version

    def test(f:(String) => Unit):Unit ={
      f("Leon Test")
    }
    def fun(name:String):Unit ={
      println("Name: " + name)
    }
    test(
      (name: String) => {
      println("Name: " + name)
    })
    test(
      (name: String) => println("Name: " + name)
      )

    test(
      name => println("Name: " + name)
    )
//    test( println("Name: " + _))//虽然name只使用一次，但是不能嵌套使用，所以这里不能写下划线

    //下面的代码不是至简原则，是scala刚好声明了println函数
    test(println)

  }
}
