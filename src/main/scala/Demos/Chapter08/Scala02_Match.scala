package Demos.Chapter08

object Scala02_Match extends App {
  //todo 模式匹配
  //java中的switch穿透现象，仅仅是个现象，不是错误
  //恰恰这个现象可能会导致代码歧义，使用scala中不存在

  //如果代码逻辑只有一行，那么可以省略大括号，但是需要明确执行完毕后，自动跳出


  val age=30
  //1。java的switch语法，case关键字和default关键字存在执行的先后顺序
  //scala中没有default关键字，如果将下划线分支放置在最前面，那么会优先执行
  //3。scala中的模式匹配的主要作用就是按照指定的规则，对数据进行匹配
  //如果数据没有匹配任何的规则，就会发生错误：matcherror

  age match {
    case 10 => println("age equals 10")
    case 20 => println("age equals 20")
    case _ => println("Other")
  }


}
