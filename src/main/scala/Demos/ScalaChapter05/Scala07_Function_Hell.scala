package Demos.ScalaChapter05

object Scala07_Function_Hell {
  def main(args: Array[String]): Unit = {
    //todo functional programming: hell version

    /*
    scala 语言时完全面向对象的语言，所以万物皆对象
    scala语言是完全面向函数式的编程语言，万物皆函数
    */
    //todo 函数也是对象
    //scala：声明了一个函数，等同于声明了一个函数对象

    def test():Unit={

    }
    println(test())//print test method's results

    //如果不想函数执行，只是想访问这个函数本身，可以采用特殊符号进行转换
    val a = test ()
    val b = test _
    val c :()=> Unit = test
    println(test _)



  }
}
