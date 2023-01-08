package Demos.Chapter10

object Scala02_Transform extends App {
  //todo 隐式转换- 二次编译
//如果年龄本来设定的是int，现在要改成double，如果挨个儿去修改会很麻烦
//增加transform函数，通过编程手段转换类型解决，但是解决过程不能违背ocp原则
//编译器可以理解为代码生成器
//编译器在编译时，如果出现错误，此时可以自动查找相应转换操作
//如果查找到，会自动进行转换，进行二次编译
//如果想要编译起可以找到指定的转换规则，需要将方法使用特殊关键词声明implicit

implicit def transform(d:Double):Int={
  d.toInt
}
// 此时，我并没调用transform，编译器自动帮助
  val age:Int =thirdPartGetAge()
  println(s"The age is $age")

  def thirdPartGetAge(): Double = {
    10.5
  }

  //
}
