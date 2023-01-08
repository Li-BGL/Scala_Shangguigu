package Demos.Chapter07

import scala.collection.mutable
import collection.parallel.CollectionConverters.ImmutableSeqIsParallelizable

object Scala16_Collection_Par extends App {

  //todo 集合- 并行集合
  //并行计算：就是同时计算
  //所谓的同时计算，应该是有多个线程，才能体现
  //par将普通集合转换成并行集合


  val result1 = (1 to 5).map{x=>Thread.currentThread.getName}
  val result2 = (1 to 5).par.map{x=>Thread.currentThread.getName}
  println(result1)
  println("...................")
  println(result2)


}
