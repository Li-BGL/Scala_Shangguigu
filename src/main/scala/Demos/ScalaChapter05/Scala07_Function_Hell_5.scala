package Demos.ScalaChapter05

object Scala07_Function_Hell_5 {
  def main(args: Array[String]): Unit = {
    //todo functional programming: hell version
    //todo 名称真的那么重要吗？
    //如果将函数对象作为参数使用时，那么参数名称很重要，因为调用时使用的就是参数名称

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
//    test(sum)
// 如果函数没有名称和def，那么是匿名函数，一般就是作为参数使用
    test (
         (x: Int, y: Int)=> {
            x + y
         }
    )
    // todo 匿名函数作为参数使用时，可以采用至简原则
    //1。匿名函数的逻辑代码只有一行，省略大括号
    test(
      (x: Int, y: Int) => x + y
    )
    //2。如果匿名函数的参数类型可以腿短出来，那么参数类型可以省略
    test(
      (x, y) => x + y
    )
    //3。如果参数列表个数只有一个，小括号可以省略，上面有俩个，不可以

    //4。匿名函数中如果参数按照顺序只执行一次的场合，那么可以使用下划线代替参数列表，省略箭头
    //第一个下划线代表第一个参数，按照顺序，第二个下划线表示第二个参数
    test(_ + _)
    test(_ - _)

  def test2(f: (String)=> Unit): Unit ={
    f("Leon")
  }

    def fun(name:String):Unit = {
      println(name)
    }
//
//    test2(
//      (name: String) => {
//      println(name)
//    })
//
//    test2(
//      (name: String) => println(name)
//    )
//    test2(
//      (name) => println(name)
//    )
//    test2(
//      name => println(name)
//    )
    test2(println(_))

  }
}
