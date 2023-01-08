package Demos.Chapter08

object Scala07_Match extends App{
  //scala是强类型语言，编译时必须明确数据的类型
  //可以实现字符拼接
  //Any类型不能实现数值+1
  val list: List[Any] = List(1, 2, 3, "4", 5, 6, 7, 8)
  val newlist= list.map{
    case i: Int => i + 1
    case j: String => j + "1"

  }
  println(newlist)

}
