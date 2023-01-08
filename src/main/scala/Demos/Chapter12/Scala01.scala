package Demos.Chapter12

object Scala01 extends App {

  val regex = "s u".r

  val str:String = "Stupid"
  val maybeString: Option[String] = regex.findFirstIn(str)

  if (maybeString.isEmpty) {
    println("Nothing matches")
  }else {
    println("Matches"+maybeString)
  }

}
