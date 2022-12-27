package part1basics

object stringops extends App {
  val str: String = "Hello, I am learning scala"

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.replace(" ","-"))
  println(str.startsWith("I"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val numberstring="45"
  val aNumber=numberstring.toInt
  println('a' +: numberstring:+'z')
  println(str.reverse)
  println(str.take(7))

//s-interpolators
  val name="David"
  val age=12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val greeting2=s"Hello, my name is $name and I will be turing ${age+1} years old!"
  println(greeting)
  println(greeting2)

  //F-interpolators
  val speed = 1.2f
  val myth=f"$name%s can eat eat $speed%2.3f burgers per minute"
  println(myth)

//  raw-interpolators
   println(raw"This is a \n newline")
   val escaped= "This is a \n newline"
   println(raw"$escaped")


}
