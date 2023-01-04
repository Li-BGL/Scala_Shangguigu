package Demos.Chapter07

import scala.collection.mutable

object Scala09_Collection extends App {

  //todo 集合-Tuple
  // 如果元组中的元素数量为2，那么称之为对偶元组，也称之为键值对对象
  val t1 = ("a",1)
  val t2 = ("b",2)

  private val tuple: (String, Int) = "a" -> 2 //箭头表示形成元组
  //1->2->3->4: (((1,2),3),4)

  //println(Map)


  //todo Map集合的操作有了变化
  val map = Map (
    ("a",1),("b",2),("c",3)
  )
//  println(map)
  for (kv<- map) {
    println(kv._1 + "=" +kv._2)
  }



  








}
