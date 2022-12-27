package Demos.ScalaChapter04

object Flow extends App {
  //TODO 默认情况下，程序流程为顺序执行
  println("123")
  println("456")
  println("789")

  //If else 分支流程
  //语法上使用if进行流程的分支判断。if关键字可以独立使用，称之为单分支。和else一起使用，叫双分支
  //if， else if，else，多分枝
//  val age = 20
//  if (age == 30) {
//    println("Age is 30 years old!")
//  } else println("Age is not 30 years old!")

  val age = 50
  if (age <= 16) {
    println("Youth")
  }
  else if( age>16 && age <=30) {
    println("young men")
  }
  else if (age>30 && age<=45){
    println("middle aged")
  }
  else if (age>45 && age<= 60) {
    println("old men")
  }
  else {
    println("very old men")
  }


}
