package Demos

object name extends App {
  val * = "Leon is a cheeky monkey!!!"
  println(*)

  println(
    """
      |Hello
      |Scala!
      |""".stripMargin)

  val name = "Leon"
  val age = 8

  println(
    s"""
      |{"name:"$name", "age": $age}
      |""".stripMargin)
  println(
    """
      |select
      |*
      |from user
      |where id = 1
      |""".stripMargin)
}
