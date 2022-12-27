package Demos.ScalaChapter05

object Scala05_Function_1 {
  def main(args: Array[String]): Unit = {
    //todo functional programming: easy version

    //下面的代码存在俩个问题：
    //1 参数传值为null，并不是没有传值，只是传了一个特殊值而已
    //2 在一个函数中，有相同含义的多个变量，容易出现歧义
    //todo scala榆垡镇可以给参数设定默认值，调用时，参数可以不需要传递
//
//    def test(name:String, password: String):Unit={
//      var newPswd = password
//      if (newPswd == null) newPswd = "000000"
//
//      println(s"User: $name, password: $password")
//    }
//
//    test("Leon","000000")
//    test("Jayden","000000")

    //if password不传，就默认000000，如果传了，就覆盖默认值，如下面

    def test1(name: String, password: String = "000000"): Unit = {
      println(s"User: $name, password: $password")
    }

    test1("Leon")
    test1("Jayden", "123123")


  }
}
