package Demos.Chapter07

import Demos.ScalaChapter06.scala08_Object_Instance.User

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.Source

object Scala11_Collection_method_wordcount_1 extends App {

  //todo 集合- 使用功能函数实现word count-迭代式开发-简化
  //迭代式开发：上一步的output是下一步的input
  //统计一个单词出现的次数（频率）-》词频

  //1. 获取数据源
  val source=Source.fromFile("/Users/lzhao/projects/Scala learning/Shangguigu-scala-learn/data/word")
  val dataList: List[String] = source.getLines().toList //获取每一行

  source.close()

  val wordList= dataList
    .flatMap(_.split(" "))
    .map((_,1))
    .groupBy(_._1)
    .view.mapValues(_.size)
    .toList.sortBy(_._2)(Ordering.Int.reverse)
    .take(3)

  println(wordList)










}
