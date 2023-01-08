package Demos.Chapter09

import java.io.FileInputStream

object Scala02_Exception extends App {
  //todo exception异常
  //scala中异常处理类似于模式匹配
  //异常捕捉时，无需考虑的范围。但是如果异常范围大的先捕捉，其他异常就捕捉不到，没有意义
  //通常把范围小的放前面

  try{
    val i=0
    val j=10/i

  } catch {
    case e: ArithmeticException=>{
      println("ArithmeticException:"+e.getMessage)
    }
    case e: Exception=>{
      println("Exception:" + e.getMessage)
    }

  }finally {
    println("finally")
  }




}
