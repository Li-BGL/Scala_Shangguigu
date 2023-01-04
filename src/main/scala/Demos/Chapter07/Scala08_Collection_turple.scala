package Demos.Chapter07

import scala.collection.mutable

object Scala08_Collection_turple extends App {

  //todo 集合-
  //集合其实是数据的容器，可以容纳数据
  //如果想要让无关的数据当做一个整体来使用
  //1，"Leon"，30
  //1。 如果数据之间有关系，一般生成Bean对象，对应属性


  class User{
    var id: Int = _
    var name:String = _
    var age:Int = _
  }
  //2. 如果数据类型，含义相同，一般使用集合：set，seq【Any】，Array[Any]
  // 3。scala语言采用特殊的方式，将无关的数据（元素）作为一个整体，称之为元素的组合【元组】
  //     元组在scala中是一个特殊的集合，采用小括号声明，将数据包含到小括号中即可
  val t: Tuple = (1,"Leon",30)
  //元组也是集合，所以也有类型，TupleN【classtype】
  //tuple有个数限制:22个
  val t2: Tuple3[Int,String,Int] = (1,"Leon",30)
  println(t2)

  //turple集合限制的数据的个数，但是没有限制数据的类型，也就意味着集合对象放置在tuple中










}
