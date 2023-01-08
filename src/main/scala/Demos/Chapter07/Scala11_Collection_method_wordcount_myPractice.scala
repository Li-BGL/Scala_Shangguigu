package Demos.Chapter07

import Demos.ScalaChapter06.scala08_Object_Instance.User

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.Source

object Scala11_Collection_method_wordcount_myPractice extends App {

  //todo 集合- 使用功能函数实现word count

  val source= Source.fromFile("/Users/lzhao/projects/Scala learning/Shangguigu-scala-learn/data/friendship")
  val sourceLine: List[String] = source.getLines().toList
  source.close()

  val wordList = sourceLine.flatMap(
    sourceLine=>{
      sourceLine.split(" ")
    }
  )
  val wordMap: List[(String, Int)] = wordList.map(
    word => {
      (word, 1)
    }
  )
   println(wordMap)
  val wordGroup: Map[String,List[(String,Int)]] = wordMap.groupBy(
    kv => {
      kv._1
    }
  )
  println(wordGroup)
  val wordCount: Map[String, Int] = wordGroup.view.mapValues(
    list => list.size
  ).toMap
    println(wordCount)
//
  val wordTop5= wordCount.toList.sortBy(
    wc=> {
      wc._2
    }
  )(Ordering.Int.reverse).take(5)
  println(wordTop5)
}
