package Demos.Chapter07

import scala.collection.mutable

object Scala09_Collection_2 extends App {

  //todo 集合: 将给定的字符串，首写字母变成大写返回
  //zhangsan=>Zhangsan
  def firstCapital(str:String):String={
    val opt = Option(str)
    if (opt.isEmpty) {
      opt.getOrElse("")
    } else {
      val value = opt.get
      if (value.trim.length == 0){
        ""
      }else {
        str.substring(0,1).toUpperCase() +str.substring(1)
      }
    }

  }
  println(firstCapital("leon"))
  println(firstCapital(""))
  println(firstCapital("a"))
  println(firstCapital("abc"))
  println(firstCapital(" a b c"))











}
