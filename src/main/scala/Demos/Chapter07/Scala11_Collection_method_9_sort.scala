package Demos.Chapter07

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala11_Collection_method_9_sort extends App {

  //todo 集合- 通用的方法-功能方法（函数）-sort

  //排序

  val list =List(1,11,2,22,6,4,5,3)

  //sortBy方法就是将数据集中的每一条数据按照指定的规则进行排序
  //sortby传递函数类型参数 Int=>B
  //Int数据集中的每一条数据
  //B 就是排序的标记
  //sortby按照标记对数据进行排序


  private val newList: List[Int] = list.sortBy(
    num => num
  )
  println(newList)
  private val newList2: List[Int] = list.sortBy(
    num => num.toString
  )
  println(newList2)
//List(1, 11, 2, 22, 3, 4, 5, 6)

//todo 默认情况下，sortBy是升序排列，如果想要降序，需要传递第二个参数列表
val newList1=list.sortBy(num=>num.toString)(Ordering.String.reverse)
  println(newList1)
val newList3=list.sortBy(num=>num)(Ordering.Int.reverse)
  println(newList3)





}
