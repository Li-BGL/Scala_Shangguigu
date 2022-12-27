package Demos.ScalaChapter04

import scala.io.StdIn
import scala.util.control.Breaks
import scala.util.control.Breaks._

object Break extends App {

  //todo 循环control ：java中：break（中断，跳出循环），continue（继续下一次循环）
  //scala中没有break和continue这俩关键字，因为不是面向对象的，可以用其他代替
  //  for (i <- Range(1, 5)) {
  //    if (i != 3)  println("i= " + i)
  //
  //  }
//  Breaks.breakable {
//    for (i <- Range(1, 5)) {
//      if (i == 3) {
//        Breaks.break() //break采用面向对象的方法来代替，底层会抛出一场跳出for循环，外层应该捕捉异常
//      }
//      println("i= " + i)
//
//    }
//  }
//  println("Main finished")
//}
//scala可以通过特殊的语法操作，让代码变得简单一些
  breakable{
    for (i<- 1 to 5){
      if (i == 3){
        break()
      }
      println("i= "+i)
    }
  }
  println("Main finished")
}


