package part2oop

import java.io
import java.io.Writer

object OOBasics extends App {
  val person= new Person ("Li",25)
  println(person.x)
  person.greet("Daniel")
  person.greet()

  val author=new Writer("Charles","Dickens",1812)
  val imposter=new Writer("Charles","Dickens",1812)
  val novel=new Novel("Great Expectations",1861,author)
  println(author.year)
  println(author.fullName)
  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))
//  println(novel.copy(1862))
  val counter = new counter
  counter.inc.inc.print
  counter.inc(3).print
  counter.dec.print
  counter.dec(5).print

}
//constructor
class Person(name:String,val age:Int) {
  //body of the class
  //can have val and var, functions and expressions
  val x = 2

  println(1 + 3)

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //overloading
  def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructors
  def this(name: String) = this(name, 0)

  def this() = this("John Doe")
}

class Writer (first:String,surname:String,val year:Int){
  def fullName:String=first+" "+surname

}

class Novel(name:String, releaseYear:Int,author:Writer){
  def authorAge=releaseYear-author.year
  def isWrittenBy(author:Writer)=author==this.author
  def copy(newYear:Int):Novel=new Novel(name,newYear,author)
}


class counter(val n:Int=0) {
  def inc = {
    println("Incrementing")
    new counter(n+1)
  }

  def dec = {
    println("Decrementing")
    new counter(n-1)
  }

  def inc(t: Int):counter = {
    if (t <= 0) this
    else inc.inc(t-1)
  }

  def dec(t: Int):counter =
    if (t <= 0) this
    else dec.dec(t-1)

  def print = println(n)

}
//class parameters are not fields.

