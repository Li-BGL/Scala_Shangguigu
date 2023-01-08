package Demos.Chapter07

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala11_Collection_method_8_groupby extends App {

  //todo 集合- 通用的方法-功能方法（函数）-groupby
  //将数据集中的数据按照指定规则进行分组
  val list= List(1,2,3,4,5,6)
  //odd and even
  //groupby 传递的参数类型为：Int => K
  //Int为数据集中的每一条数据
  //这里的K表示数据分组的标记，执行操作后，相同的标记会放在一起
  //groupby方法的执行结果会返回Map集合
  //key为分组标记，value表示相同标记的数据集合

  val value: Map[String, List[Int]] = list.groupBy(
    num => {
      if (num % 2 == 0) {
        "even"
      } else {
        "odd"
      }
    })
  println(value)
 // HashMap(odd -> List(1, 3, 5), even -> List(2, 4, 6))
 val map =list.groupBy(_%2)
 println(map)
 //HashMap(0 -> List(2, 4, 6), 1 -> List(1, 3, 5))

  //




}
