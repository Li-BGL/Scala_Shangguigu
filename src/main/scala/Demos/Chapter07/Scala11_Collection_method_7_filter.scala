package Demos.Chapter07

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala11_Collection_method_7_filter extends App {

  //todo 集合- 通用的方法-功能方法（函数）
  val list =List(1,2,3,4)
  //todo 按照指定的条件将数据集中的数据进行筛选过滤，条件成立，数据保留，否则数据丢失
  //这个功能叫做filter
  //filter方法需要传递一个参数，这个参数的类型为函数类型：Int=>Boolean
  //这里的Int是数据集中的每一条数据
  //这里的boolean表示条件执行后返回结果，为布尔类型
  val newList = list.filter(
    num => num%2 == 0)
  println(newList)
  //List(2,4), 因为每一条都要执行，可以用下划线
  val newList1 = list.filter(_% 2 == 0)
  println(newList1)






}
