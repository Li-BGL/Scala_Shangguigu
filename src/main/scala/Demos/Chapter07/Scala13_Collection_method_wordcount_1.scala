package Demos.Chapter07

import Demos.ScalaChapter06.scala08_Object_Instance.User

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.Source

object Scala13_Collection_method_wordcount_1 extends App {

  //todo 集合- 使用功能函数实现word count
  val list = List(
    ("Hello World Scala Park",4),
    ("Hello World Scala",3),
    ("Hello World",2),
    ("Hello",1),
  )
//("Hello",4) ("World",4) ("Scala",4)("Park",4)
  val listMap = list.flatMap(
    kv=> {
      val line = kv._1
      val cnt = kv._2
      val words= line.split(" ")
      words.map(
        word => (word,cnt)
      )
    }
  )
  println(listMap)

  val listGroup = listMap.groupBy(
    word=> word._1
  )
  //
//  (Park, List((Park, 4)))
//  (Scala, List((Scala, 4), (Scala, 3)))
//  (Hello, List((Hello, 4), (Hello, 3), (Hello, 2), (Hello, 1)))
//  (World, List((World, 4), (World, 3), (World, 2)))
  listGroup.view
    .mapValues(list=> list.map(_._2).sum)
    .toList.sortBy(_._2)(Ordering.Int.reverse).take(4).foreach(println)






}
