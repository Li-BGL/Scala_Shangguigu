package Demos.Chapter10


object Scala08_Transform extends App{
  //todo 隐式转换- 二次编译
  val list= List(1,3,4,2)
  println(list.sortBy(num => num)) //含隐式参数implicit ord: Ordering[B]
  //如果不想使用隐式参数，那么需要怎加括号

  println(list.sortBy(num => num)(Ordering.Int.reverse))



}
