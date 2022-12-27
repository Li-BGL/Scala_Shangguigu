package part1basics

import scala.jdk.Accumulator

object Recursion extends App {
//  def Factorial(n:Int):Int =
//    if (n<=1) 1
//    else {
//      println("Computing factorial of" + n + " -I first need to factorial of " + (n-1))
//      val result = n*Factorial(n-1)
//      println("computed factorial of " + n)
//
//      result
//    }
//  println(Factorial(30))
//
//
//  def Factorial2(n: Int):BigInt = {
//    def factHelper(x: Int, accumulator: BigInt): BigInt =
//      if(x<=1) accumulator
//      else factHelper(x-1, x*accumulator)
//
//    factHelper(n,1)
//    }
//  println(Factorial2(10))
//  println(Factorial2(3000))
//  }


  def concatenate(a:String, n:Int): String = {
    if (n <= 1) a
    else a + concatenate(a,n - 1)
  }
  println(concatenate("LiZhao", 3))


  def concatenateRecurse(a:String, n:Int, accumulator: String): String = {
    if (n<=0) accumulator
    else concatenateRecurse(a, n-1,a+accumulator)
  }
  println(concatenateRecurse("LiZhao", 4, ""))


//
  def IsPrime(n: Int): Boolean = {
    def primeHelper(x:Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (x<=1) true
      else primeHelper(x-1,n%x !=0 && isStillPrime)

    primeHelper(n/2,true)
  }
  println(IsPrime(10))


  def FibonacciFunction(n: Int): Int = {
    def fibonacciHelper(t:Int,next:Int,nextToLast: Int): Int=
      if (t>= n) next
      else fibonacciHelper(t+1, next+nextToLast, next)

    if (n<=2) 1
    else fibonacciHelper(2,1,1)
  }

  println(FibonacciFunction(7))
 }
