package Demos

object DataType_2 extends App {

  val s: String = null
  val b: Byte = 10
  val i: Int = b.toInt
  val c: Char = 'A'+1
  println(c)
  println(i)
  // byte can change to int
//TODO A是常量，可以在编译时计算，A+1直接就B了

//  val i:Int = 10
//  val c:Char =i
//  println(c)


}
