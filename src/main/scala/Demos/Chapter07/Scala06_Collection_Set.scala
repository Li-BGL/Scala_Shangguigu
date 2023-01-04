package Demos.Chapter07

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object Scala06_Collection_Set extends App {

  //todo 集合-Set（集）
  //set集合描述了无序，数据不可重复集合
  //todo构建
  //set是一个trait，不能直接构建对象，而且默认为不可变集合
  //一般情况下，集合都是采用伴生对象apply方法
  val set= Set(1,3,4,5,4,7,2,5,7,8,9)
  println(set)  //HashSet(5, 1, 9, 2, 7, 3, 8, 4)

  val set2 =Set.apply(1,2,3,4,3,1,2,3,4)
  println(set2)
  //运行完了，才会产生集合set2，1，2，3，4

  //不可变集合的基本数据操作都是采用特殊符号
  set2+5
  println(set2) //set2不可变，所以还是原来集合，需要赋值给一个新的变量
  val set3= set2 + 5
  println(set3)

  println(set.-(2))










}
