package Demos.Chapter07

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala11_Collection_method_8_mapValue extends App {

  //todo 集合- 通用的方法-功能方法（函数）-groupby

  val dataMap = Map(
    ("a",1),("b",2),("c",3)
  )
  //A=>Map=>B

  private val value: Map[String, Int] = dataMap.map(
    kv => {
      //      val k = kv._1
      //      val v = kv._2
      //      (k,v*2)
      (kv._1, kv._2 * 2)

    }
  )
//  println(value)

//todo 当kv类型的数据在转换时，如果k不变，只对v操作，可以采用mapValues
//mapValues方法需要传递一个参数，参数类型为函数类型Int=>W
//Int就是kv中的v
//w，就是对v处理后的结果

//  val newMap = dataMap.view.mapValues(
//    num => {
//      num*2}
//  )
  val newMap = dataMap.view.mapValues(_*2).toMap
  println(newMap)




}
