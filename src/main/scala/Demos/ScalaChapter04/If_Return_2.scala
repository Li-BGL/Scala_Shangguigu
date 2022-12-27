package Demos.ScalaChapter04

object If_Return_2 extends App {
  val age = 30
//  val result = if (age == 30){
//    1
//  } else "Leon"
//    println(result+1)
  //result is Any type as when compile we don't know which result it
  // will get, so Any can't +1

  //scala分支流程判断没有三元运算符 xxxx？a：b
  val result = if (age == 30) {
    "30"
  } else "Other"

  println(result)

  val result2 = if (age == 30) "30" else "Other" //simplify


}
