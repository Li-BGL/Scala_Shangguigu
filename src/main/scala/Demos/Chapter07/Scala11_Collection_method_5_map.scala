package Demos.Chapter07

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala11_Collection_method_5_map extends App {

  //todo 集合- 通用的方法-功能方法（函数）

  //map：将数据集中的每一条数据按照指定的逻辑进行转换，获取新的集合
  //map方法需要传递一个参数，这个参数的类行为函数类型：Int=》B
  //功能函数在使用时，都是采用匿名函数，而且同时简化操作
  val list = List(1,2,3,4)
  val list1= ListBuffer(1,2,3,4)

  val newList=list.map(_ *3)
  val newList1 = list1.map(_*3)
  println(list)
  println(newList)
  println(list1)
  println(newList1)
  //可变集合和不可变集合，用了map后原集合都保持不变
  //todo 当匿名函数只有一个函数，且每一个数据都要进行处理时，就可以在匿名函数中使用下划线
  // 这里的下划线就表示每一条数据




}
