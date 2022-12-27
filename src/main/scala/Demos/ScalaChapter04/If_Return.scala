package Demos.ScalaChapter04

object If_Return extends App {
  val age=30
  //scala中expression都有返回结果
  val result = if(age == 30){
    println("The age is 30!") //返回结果就是Unit
  }
  println(result) //return（）

  //这里的返回结果其实就是满足条件后的最后一行代码的执行结果

  val result2 = if(age == 30){
    1
    2
    "Leon"
  } else null
  println(result2) //this time, result2 equals the last line of the method, that is Leon
}
