package Demos.ScalaChapter05

object Scala07_Function_Hell_5_test {
  def main(args: Array[String]): Unit = {
    //todo functional programming: hell version
    def calc(x:Int,f: (Int,Int) => Int, y: Int):Int = {
      f(x, y)
    }
//    println(calc(7,_+_,3))
    println(calc(7,(x,y)=> y-x,10))
  }
}
