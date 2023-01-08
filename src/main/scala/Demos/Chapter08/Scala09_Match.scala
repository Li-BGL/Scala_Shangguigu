package Demos.Chapter08

object Scala09_Match extends App{
  //todo 模式匹配-偏函数

  //todo 功能函数中，存在偏函数和全函数
  //  全函数：表示功能函数会对数据集中的所有数据进行处理
  //  偏函数：表示功能函数会对数据集中满足条件的数据进行处理 partial function


  val list =List(1,2,"3","4")
//  list.map{
//    case i:Int => i+1
//    case j:String=> j+"1"
//  }.foreach(println)
//数据加1，字符串不要
//  list.map {
//    case i: Int => i + 1
//    case j: String => j
//  }.foreach(println)
//下面可以出来2，3
list.filter(_.isInstanceOf[Int]).map{
  case i:Int => i+1
}.foreach(println)

//如果需要对满足对象的数据进行处理，那么需要采用偏函数
//偏函数其实就是模式匹配，但是不是所有的功能都支持
//collect 方法支持偏函数操作

list.collect{case i: Int => i+1}.foreach(println)


}
