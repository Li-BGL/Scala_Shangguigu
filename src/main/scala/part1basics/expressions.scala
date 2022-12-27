package part1basics

object expressions extends App {
  val x = 1 +2 //expressions
  println(x)

  println(1 == x)

  var aString = 2
  aString +=5
  println(aString)

  //instructions tell the computer what to do
  //expressions tell sth has a value or a type
  //IF expressions

  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 4
  println(aConditionedValue)

  var i=1
  while (i<10)
    println(i)
    i +=1

    //never write this again!

   val aWeiredValue =(aString = 3)
   println(aWeiredValue)

   //aWeiredValue is a unit.

   //side effects: println(), whiles, reassigning

   val aCodeBlock = {
     val y=2
     val  z=y+1
     if (z>2) "Hello" else "Goodbye"
   }
   //code blocks in Scala are expressions
  // as z is defined within a code block, it is not recognized by the outside of the code block
  val someValue = {

    2 < 3

  }
   println(someValue)

  val someOtherValue = {

    if (someValue) 239 else 986

    42

  }
  println(someOtherValue)

}
