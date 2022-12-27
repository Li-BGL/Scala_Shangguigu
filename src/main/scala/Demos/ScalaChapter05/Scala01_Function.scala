package Demos.ScalaChapter05

object Scala01_Function extends App {
  //Todo 函数式编程语言
  //1 Scala中的函数并不是数学中的函数，这里的函数其实是功能的封装
  //2 java 中功能的封装一般称之为方法，scala中叫函数，但是声明在类中函数称之为方法
  //函数只在当前作用域有效，但是方法需要受到类的约束
  //3 因为函数其实就是功能的封装，也就意味着功能的名称不能重复，也就没有重写重载的概念
  // 因为方法属于类，那么就可能存在方法的重载，重写（父类子类）

  val s = "leon"
  val newS= s.substring(0,1).toUpperCase()+s.substring(1)
  println(newS)
//todo 函数的声明和使用
  //声明：def 函数名（参数列表）：返回值类型={函数体}
  //使用=》函数名（参数）

  def test():Unit={
    println("Test....")
  }
  test()

}
