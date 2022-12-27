package Demos.ScalaChapter04

object ForLoop extends App {
  //循化表达式{
  //循环体}
  //如果表达式条件成立，那么执行循化提擦欧哦，然后在判断条件，以此类推

  //TODO For Loop
  /*
  for (obj: Object <- Array){
    println(obj)
  }
   */
  val array = 1 to 5
  for (i:Int<-array){
    println(i)
  }
  val array1 = 1 until 5 //not include 5
  for (i: Int<-array1){
    println(i)
  }

  for(j <- Range(1,6)){//as the compiler knows that j is Int, we don't have to write Int)
    println(j)
  }

  // 循环守卫
  for (k <- Range(1,6) if k !=3){
    println(k)
  }
  //TODO 循环步长，默认为1 by() range(1,8,2) the same
  for (k <- Range(1, 8) by(2) if k != 3) {
    println(k)
  }
  for (k <- Range(1, 8,2) ) {
    println(k)
  }
  //循环嵌套
  for (i:Int <-1 to 3){
    for (j:Int <- 1 to 3) {
      println("i= " + i + ", j = " + j)
    }
  }
  for ( i <-Range(1,3); j:Int <-Range(1,3)){
    println("i= " + i + ", j = " + j)
  }
  //引入变量
  for (i <- 1 to 3){
    val j= i-1
    println(j)
  }
  //simplify
  for (i<-1 to 3; j=i-1){
    println(j)
  }

  //杨辉三角，九层妖塔
  for(i<- 1 to 9){
    val stars= 2*i - 1
    val space = 9-i
    println(" "* space + "*" * stars)
  }


}
