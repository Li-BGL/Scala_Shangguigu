package Demos

object PatternMatching extends  App {
  //switch statement, expression
  val anInteger = 55
  val order = anInteger match {
    case 1 => "first"
    case 2 => "second"
    case 3 => "third"
    case _ => anInteger + "th"
  }
  //pattern matching is an expression
  println(order)

  // case class decomposition
  case class Person(name:String,age:Int)
  val bob = Person("Bob",42) //Person.apply("Bob",43)

  val personGreeting = bob match {
    case Person(n,a) => s"Hi, my name is $n, I am $a years old."
    case _ => "Something else"
  }
  println(personGreeting)

  //deconstructing tuples
  val aTuple = ("Bon Jo", "Rock")
  val bandDescription = aTuple match {
    case (band,genre) => s"$band belongs to the genre $genre"
    case _ => "I don't know what you are talking about"
  }
  println(bandDescription)

  //decomposing lists
//  val aList = List (1,2,3)
//  val listDe

}
