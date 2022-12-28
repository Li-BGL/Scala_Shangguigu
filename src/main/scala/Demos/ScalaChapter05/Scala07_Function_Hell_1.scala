package Demos.ScalaChapter05

object Scala07_Function_Hell_1 {
  def main(args: Array[String]): Unit = {
    //todo functional programming: hell version

    /*
    scala 语言时完全面向对象的语言，所以万物皆对象
    scala语言是完全面向函数式的编程语言，万物皆函数
    */
    //todo 函数也是对象
    //1。 对象应该有类型
    //2。 对象应该可以赋值给其他人使用

    def test():Unit={

    }
    def test1(age:Int): String={
      age.toString
    }
    // 将函数对象test赋值给f
    //此时，f可以通过编译器自动腿短类型，函数对象的类型称之为函数类型
    val f: Function0[Unit] = test _
    //0 表示参数的个数，中括号的unit表示函数没有返回值
    //int: 参数类型，string ：返回值类型
    //todo 【函数对象】的参数最多只能22个，函数参数个数没有限制

    val f1: Function1[Int,String] = test1 _

    def test3(name:String,age:Int)={

    }
    // (String, Int) => unit
    val f3 = test3 _
    f



  }
}
