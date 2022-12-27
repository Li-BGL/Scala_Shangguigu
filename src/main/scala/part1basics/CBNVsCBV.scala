package part1basics

object CBNVsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("By value: " + x)
    println("By value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("By Name: " + x)
    println("By Name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

}
