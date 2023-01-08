package Demos.Chapter08

object Scala04_Match_1 extends App {
  //todo 模式匹配-规则匹配
  //todo 匹配数组

//  val arrs = Array(
//    Array(0),
//    Array(1, 0),
//    Array(0, 1, 0),
//    Array(1, 1, 0),
//    Array(1, 1, 0, 1))
//  for (arr <- arrs) {
//    val result = arr match {
//      case Array(0) => "0"
//      case Array(x, y) => x + "=" + y
//      case Array(0, _*) => "以 0 开头和数组"
//      case _ => "什么集合都不是"
//    }
//    println("the result is: " + result)
//  }

  //todo 匹配列表
  //val list =List(1,2,5,6,7) ////1-2-List(5, 6, 7)
//  val list=List(1,2) //1-2-List()
//  val list= List(1) //sth else
//  list match
//    case first::second::rest=> println(first +"-" + second +"-"+rest)
//    case _=>println("something else")
//todo 匹配元组
  for (tuple <- Array(
    (0, 1), //"0 ..."
    (1, 0),//10
    (1, 1), //1 1
    (1, 0, 2))) {
    val result = tuple match {
      case (0, _) => "0 ..." //是第一个元素是 0 的元组
      case (y, 0) => "" + y + "0" // 匹配后一个元素是0的对
      case (a, b) => "" + a + " " + b
      case _ => "something else" //默认
    }
    println(result)
  }


}
