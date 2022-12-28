package Demos.ScalaChapter05

object Scala05_Function_2 {
  def main(args: Array[String]): Unit = {
    def test (password: String = "000000",name: String): Unit = {
      println(s"User: $name, password: $password")
    }
//如果需要改变参数顺序，可以采用带名参数
    test(name="Leon")
  }
}
