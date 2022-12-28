package Demos.ScalaChapter05

object Scala06_Function_nightmare {
  def main(args: Array[String]): Unit = {

    //todo scala为了开发人员更便捷开发程序，可以简化很多代码
    // 如果编译起可以动态识别的语法，那么developer不需要编码，可以省略
    //至简原则：能省则省

    def test():String ={
      return "Leon"
    }
    //todo 1: 如果函数体中的逻辑代码需要返回，可以省略return关键字
    // scala语言中，所有的表达式可以直接将满足条件的最后一行的代码逻辑的结果作为返回值
    def test1(): String = {
      "Leon"
    }
    //todo 2：如果函数的逻辑代码只有一行，那么可以将大括号省略
    def test2(): String = "Leon"

    //todo 3：如果能够通过返回值推断出返回值类型，那么返回值类型可以省略
    def test3() = "Leon"

    //todo 4: 如果参数列表中没有声明参数，那么小括号可以省略
    //如果省略参数列表的小括号，那么调用时也不能添加
    //因为省略了很多的语法内容，所以变量声明和函数声明很像，所以采用关键字区分
    def test4 = "Leon"
    println(test4)

    //todo 5：如果逻辑代码中有return返回，但是函数声明为unit，此时return不起作用
    //此时，如果想要省略unit，会发生错误。
    //如果既想省略unit，又不希望发生错误，可以将等号同时省略

//    def test5():Unit={
//      return "Leon"
//    }
//    def test5() {
//      return "Leon"
//      }
//    println(test5())
//doesn't work
  //todo 6. 如果函数名称不着的时候，def和函数名也可以省略，称之为匿名函数
  //1。 def 和函数名要省略
  // 2。 返回值类型也需要省略，有逻辑代码自动推断
  //3。 等号需要增加大于号表示关联
    () => {
      println("Leon")
    }
        
    //怎么调用？

  }
}
