package Demos.Chapter07

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object Scala06_Collection_Set_1 extends App {

  //todo 集合-Set（集）
  //可变的set集合，需要根据包名进行区分的
  val set = mutable.Set(1,2,3,4,5,3,6,8)
  println(set)
  val set2 = mutable.Set(1,2,3,4)

  //todo 增删改查
  //set集合没有append，insert方法，因为没有顺序概念
  set2.add(5)
  println(set2)

  //修改数据：set集合没有位置的概念，所以无法对指定位置修改
  //所以这里的修改，仅仅是数据的状态修改
  set2.update(6,true) //把6包含进去
  set2.update(5,false)
  set2(7) =true //也可以这样写
  println(set2)

  //删除数据
  set2.remove(2)
  println(set2)




}
