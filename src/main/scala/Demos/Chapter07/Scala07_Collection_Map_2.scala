package Demos.Chapter07

import scala.collection.mutable

object Scala07_Collection_Map_2 extends App {

  //todo 集合-Map（映射，关联）
  //构建可变的Map集合
  val map = mutable.Map("a" -> 1,"b" -> 2,"c" -> 3)
  println(map)

  // todo 按照key或者value
  private val maybeInt: Option[Int] = map.get("a") //Some(3)
  //get返回some：有值，如果数据有值，那么可以获取真实结果
  // none：无值，无序获取结果，如果获取，会发生错误
  //这里之所以采用新的类型获取结果，主要原因是为了避免空指针异常
  private val maybeInt1: Option[Int] = map.get("d")
  if (maybeInt1.isEmpty){
    println("No value")
  } else{
    println("Yes Value"+maybeInt1.get)
  }
//  println(maybeInt1.get)

  println(maybeInt1) //返回none

//  println(maybeInt1.get) //会报错
  println(maybeInt1.getOrElse(-1))

  //map集合为了方便操作，也提供了类似于getorelse方法

 val result = map.getOrElse("d",0)
 println(result)   //0











}
