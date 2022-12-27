package part1basics

import java.security.KeyStore.TrustedCertificateEntry

object Functions extends App {
  def aFunction (a:String, b:Int): String = {
    a + " " + b
  }
  println(aFunction("Hello",3))

  def aParameterlessFunction(): Int = 45
  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n: Int):String ={
    if(n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("Hello",4))
//when you need loops, use recursion
  def aBigFunction(n:Int): Int={
    def aSmallFunction (a:Int,b:Int):Int = a + b

    aSmallFunction(n,n-1)
  }
  println(aBigFunction(4))

  def Greeting (name:String,age: Int): String = {
    "Hi, my name is " + name +", and I am " + age+" years old"
  }

  println(Greeting("Li", 39))


  def FactorialFunction (n:Int): Int = {
    if (n == 1) 1
    else n*FactorialFunction(n-1)
  }
  println(FactorialFunction(4))



  def FibonacciFunction(n:Int):Int= {
    if (n <= 2) 1
    else FibonacciFunction(n - 1) + FibonacciFunction(n - 2)
  }

    println(FibonacciFunction(7))


    def isPrime(n:Int):Boolean = {
      def isPrimeUntil(t: Int) :Boolean =
        if (t <= 1) true
        else n % t != 0 && isPrimeUntil(t-1)

      isPrimeUntil(n / 2)

    }
    println(isPrime(2003))
  }
