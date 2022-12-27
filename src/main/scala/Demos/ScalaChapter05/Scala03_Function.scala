package Demos.ScalaChapter05

object Scala03_Function {
  def main(args: Array[String]): Unit = {

    //Todo function vs method
    //函数的本质就是java中的方法
    //scala源码中，方法就是函数，编译后的字节码中，函数就是方法
    //函数编译成方法时，增加了修饰符：private static final
    //函数编译成方法时，函数名会自动发生变化。如果有方法名和函数名一样，就会发生变化，避免冲突
    

    def test():Unit={
      println("test.....")
    }
    test()
  }
}
