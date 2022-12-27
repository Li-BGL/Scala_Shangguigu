package Demos

object DataType_1 extends App {

  val i: Int = 10
  val s: String = "abcde"
  println(i)

//  type Null is ineligible
  //  val j: Int = null
//  println(j)
  val a: AnyVal = i
  val b: AnyRef = s
  println(a)
  println(b)

  val c: Any = a
  println(c)

}
