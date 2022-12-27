package Demos

object FunctionalProgramming extends App {
  //Scala is OO
  class Person(name:String){
    def apply(age:Int) = println(s"I have spent $age years!")
  }
  val bob = new Person("Bob")
  bob.apply(43)
  /*
  Scala runs on the JVM
  Functional programming:
  -compose functions
  -pass functions as args
  - return functions as results

  conclusion: FunctionX = Function1, Function2, Function3....Function22
  */
  val simpleIncrementer = new Function1[Int,Int] {
    override def apply(arg:Int):Int = arg +1
  }
  println(simpleIncrementer(23))
//ALL Scala functions are instances of these function x types
  //function with 2 arguments and a String return type
  val stringConcatenator = new Function2[String,String,String]{
    override def apply(arg1: String, arg2: String): String = arg1 + arg2
  }
  println(stringConcatenator("I love", " Scala"))

  //syntax sugars
  val doubler:Function1[Int,Int] = (x:Int) => 2*x
  println(doubler(2))
  /*equivalent to the much longer:
  new Function1[Int, Int]{
     override def apply(x: Int) =x*2
     }
   */
  val doubler2:Int =>Int = (y:Int) =>3* y
  println(doubler2(5))
  val doubler3 = (z:Int) => 4*z
  println(doubler3(3))

  //high order functions: take functions as args/return funcstions as results

  val aMappedList =List(1,2,3).map(x=>x+1)
  println(aMappedList)
  val aFlatMappedList = List(1,2,3).flatMap { x =>
    List(x, 2*x)
  }
  //alternative syntax, same as .flatMap(x =>List(x, 2*x))
  println(aFlatMappedList)
  val aFilteredList = List(1,2,3,4,5).filter(x => x<=3)
  //even simple syntax .filter(_<=3)
  println(aFilteredList)

  val allPairs = List(1,2,3).flatMap(x => List("a","b","c").map(letter => s"$x$letter"))
  println(allPairs)

  // for comprehensions
  val alternativePairs = for{
    number <- List(1,2,3,4)
    letter <- List("a","b","c","d")
  } yield s"$number-$letter"
  //equivalent to the map/flatMap chain above

  /**
   * *collections
   */

  //lists
  val aList= List(1,2,3,4,5)
  val firstElement=aList.head
  val rest= aList.tail
  val aPrepenededList= 0:: aList
  val anExtendedList= 0+: aList :+6
  println(aPrepenededList)
  println(anExtendedList)

  //sequences

  val aSequence:Seq[Int] =Seq (1,2,3) //Seq.apply(1,2,3)
  println(aSequence)
  val accessedElement =aSequence(1)
  println(accessedElement)

  //vectors: fast Seq implementation
  val aVector = Vector (1,2,3,4,5)
  println(aVector(3))

  //sets= no duplicates
  val aSet = Set(1,2,3,4,5,2,3,4,2)
  println(aSet)
  val setHas5 = aSet.contains(6) //return true or false to see if the set contains this number
  println(setHas5)
  val anAddedSet = aSet+8
  println(anAddedSet)
  val aRemovedSet = aSet -3
  println(aRemovedSet)

  //ranges
  val aRange = 1 to 1000
  val twoByTwo = aRange.map(x => 2*x).toList
  println(twoByTwo)

  //tuples = groups of values under the same value
  val aTuple =("Bon Jovi", "Rock",1982) // same as python
  println(aTuple)

  //maps
  val aPhonebook: Map[String,Int] = Map(
    ("Leon", 0430328086),
    "Rui" -> 0452215211
  )
  println(aPhonebook)








}
