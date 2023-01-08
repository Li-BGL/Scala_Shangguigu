package Demos.Chapter07

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala11_Collection_method_6_flat extends App {

  //todo 集合- 通用的方法-功能方法（函数）

  val list = List(List(1,2,3),List(4,5,6))
  println(list.size)

  //todo 将集合中的整体数据拆分成个体来使用的功能，称之为扁平化操作
  val newList: List[Int] = list.flatten
  println(newList) //List(1, 2, 3, 4, 5, 6)

  val list2= List("Hello Scala", "Hello Li")
//  val newList2: List[Char] = list2.flatten
//  println(newList2)
  //flatten方法会将字符串当作为char数组，扁平化后，是一个一个的char
    //List(H, e, l, l, o,  , S, c, a, l, a, H, e, l, l, o,  , L, i)
    //这时候用flatten不合适，如果想要自定的扁平化规则，采用另一个功能函数flatMap
    //1=>N
    //flatMap传递的参数类型为函数String（数据集中的每一条数据）=》GenTranversableOnce
    //GenTranversableOnce其实就是数据集中的每一条数据，集合类型的顶层通用类型，任何集合都可以此处使用


  println(list2.flatMap(
    str => {
      str.split(" ")
    }
  ))
  //List(Hello, Scala, Hello, Li)
  val list3 = list2.flatMap(_.split(" "))
  println(list3)



}
