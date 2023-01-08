package Demos.Chapter07

import Demos.ScalaChapter06.scala08_Object_Instance.User

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.Source

object Scala14_Collection_method_foldScan extends App {

  //todo 集合- 功能函数 -计算
  //reduce方法将数据集合中的数字两两计算，获得最终结果
  //但是在某些情况下，需要将数据集和外部的数据进行聚合，这个时候，reduce无法使用
  //如果还想要聚合，需要用其他函数，fold
  //fold原则还是两两聚合
  val list =List(1,2,3,4)
  val i = list.fold(5)(_+_) //存在函数curry
  println(i)

  //第一个参数列表中传递一个参数：初始值
  //第二个参数列表中传递函数类型参数，表示计算逻辑
  val i2=list.fold(5)(_-_)
  println(i2)

  val i3=list.foldLeft(5)(_-_)
  println(i3)
  //5-1-2-3-4=-5

  val i4 = list.foldRight(5)(_ - _)
  println(i4)
//5 4 3 2 1 : 1-(2-(3-(4-5)))=1-(2-(3+1))=1-(2-4))=3

//todo 扫描的功能
//可以将fold，foldleft和foldright的执行过程记录下来

  println(list.scan(5)(_ - _))
  println(list.scanLeft(5)(_ - _))
  println(list.scanRight(5)(_ - _))




}
