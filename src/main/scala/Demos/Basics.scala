package Demos

object Basics extends App {
  val meaningOfLife:Int = 42
  val aBoolean = false
  val aString = "I am confused in learning Scala"
  val aComposedString = "I" + "" + "love"+ "scala"
  val anInterpolatedString= s"The meaning of life is $meaningOfLife"

  val andExpression= 12+4
  //if statement is an expression, assigning values to it

  val ifExpression = if (meaningOfLife>43) 56 else 999
  val chainedExpression= {
    if (meaningOfLife>43) 56
    else if (meaningOfLife<0) -2
    else if (meaningOfLife>999) 999
    else 0


  //code blocks

    val aCodeBlock={
      val aLocalValue = 67
      aLocalValue+3
    }

    //define a function
    def myFunction(x:Int, y:String): String ={
      y + "" +x
    }

    //recursive functions
    def factorial (n:Int):Int =
      if (n<=1) 1
      else n*factorial(n-1)

    //In Scala we don't use loops or iteration, we use RECURSION

    //the Unit type = no meaningful value == "void" in other languages
    def myUnitReturningFunction():Unit={
      println("I love Scala")
    }



  }


}
