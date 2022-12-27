package exercises

import math.Integral.Implicits.infixIntegralOps
import math.Fractional.Implicits.infixFractionalOps
import math.Numeric.Implicits.infixNumericOps

abstract class MyList[+A] {
  //head= first element of the list
  //tail= remainder of the list
  //isEmpty= is this list empty
  //add(int)=> new list with this new element added
  //override  toString=> a string representation of the list
  def head: A

  def tail: MyList[A]

  def isEmpty: Boolean

  def add[B >: A](element: B): MyList[B]

  def printElements: String

  override def toString: String = "[" + printElements + "]"

  //  def map[+B](transformer: MyTransformer[A,B]): MyList[B]
  //  def flatMap[B] (transformer: MyTransformer[A, MyList[B]]: MyList[+B])
  //  def filter(predicate: MyPredicate[A]): MyList[A]
  //
  //}

  object Empty extends MyList[Nothing] {
    def head: Nothing = throw new NoSuchElementException

    def tail: MyList[Nothing] = throw new NoSuchElementException

    def isEmpty: Boolean = true

    def add[B >: Nothing](element: B): MyList[B] = new Cons(element, Empty)

    def printElements: String = ""
  }

  class Cons[+A](h: A, t: MyList[A]) extends MyList[A] {
    def head: A = h

    def tail: MyList[A] = t

    def isEmpty: Boolean = false

    def add[B >: A](element: B): MyList[B] = new Cons(element, this)

    def printElements: String =
      if (t.isEmpty) "" + h
      else "" + h + " " + t.printElements
  }

  object ListTest extends App {
    //  val list=new Cons(1,Empty)
    //  println(list.head)
    val listOfIntegers: MyList[Int] = new Cons(1, new Cons(2, new Cons(3, Empty)))
    val listOfStrings: MyList[String] = new Cons("Hello", new Cons("Scala", Empty))
    println(listOfStrings.toString)
    println(listOfIntegers.toString)
  }

  object ListTest2 extends App {
    val list2 = new Cons(1, new Cons(2, new Cons(3, Empty)))
    println(list2.head)
    println(list2.tail)
    println(list2.tail.head)
    println(list2.add(4).head)
    println(list2.isEmpty)
    println(list2.toString)
  }
  // generic trait MyPredicate[T] with a little method test(T)=> Boolean
  // generic trait MyTransformer[A, B]
  // MyList:
  // - map(transformer) =>MyList
  // -filter(predicate) => MyList
  // -flatMap(transformer from A to MyList[B}) =>MyList

  trait MyPredicate[-T] {
    def test(element: T): Boolean
  }

  //    def filter: T
  //  }

  trait MyTransformer[-A, B] {
    def transform(element: A): B

  }

//  class EvenPredicate(n: Int) extends MyPredicate[Int] {
//    override def filter: Int = n % 2
//  }
}