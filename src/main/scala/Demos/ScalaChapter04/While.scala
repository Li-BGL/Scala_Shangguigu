package Demos.ScalaChapter04

import scala.io.{BufferedSource, Source, StdIn}

object While extends App {
  /*
  while(条件表达式){
  循环体
  」

   */
//  while (true) {
//    println("True")
//  }
//private val source: BufferedSource = Source.fromFile("/Users/lzhao/Udemy-scala-beginners-master/Udemy-scala-learn/src/main/scala/Demos/world")
//
//  private val iter: Iterator[String] = source.getLines()
//  while (iter.hasNext){
//    println(iter.next())
//  }
//  source.close()
//
//
//  val classNum = 3
//  val studentNum = 5
//  var score = 0.0
//  var classScore = 0.0
//  var totalScore = 0.0
//  for (i<- 1 to classNum){
//    classScore=0
//    for(j<- 1 to studentNum){
//      println(s"please input No. $i class's $j th student's score")
//      score= StdIn.readDouble()
//      classScore=classScore+score
//    }
//    totalScore=totalScore+classScore
//    println(s"average score of class $i = ${classScore/studentNum}")
//  }
//  val t = totalScore/(studentNum*classNum)

  val t: Float = 12.3334f
  println(f"overall average score: $t%.2f")
  val height = 1.9d
  val name = "James"
  println(f"$name is $height%2.2f meters tall")
}
