package Demos.Chapter07

import Demos.ScalaChapter06.scala08_Object_Instance.User

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.Source

object Scala15_Collection_Queue extends App {

  //todo 集合- Queue

  val que = new mutable.Queue[String]()

  que.enqueue("a","b","c")
//先进先出
  val que1=que += "d"
  println(que eq que1)

  println(que.dequeue())
  println(que.dequeue())
  println(que.dequeue())
  println(que.dequeue())

  //并行计算：就是同时计算
  //所谓的同时计算，应该是有多个线程，才能体现











}
