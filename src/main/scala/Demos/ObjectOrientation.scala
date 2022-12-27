package Demos

object ObjectOrientation extends App {
  //class and instance

  class Animal{
    //define fields and methods
    val age: Int = 0

    def eat() = println("I am eating")
  }

  val anAnimal = new Animal
  anAnimal.eat()

  //inheritance
  //constructor definition
  class Dog (val name: String) extends Animal{
    override def eat()=println("I am a Dog eating")
  }

  val aDog =new Dog("Rosie")
  aDog.eat()
  //constructor arguments are NOT fields: need to put a val before the constructor argument
  aDog.name

  //subtype polymorphism
  val aDeclaredAnimal:Animal= new Dog("Hachi")
  aDeclaredAnimal.eat() //the most derived method will be called at runtime

  //abstract class
  abstract class walkingAnimal{
    val hasLegs = true // by default public, you can restrict by using private or protected
    def walk():Unit
  }

  //interface = ultimate abstract type
  trait Carnivore{
    def eat(animal: Animal):Unit
  }

  trait Philosopher {
    def ?! (thought: String): Unit   //valid method name
  }

  //single class inheritance and multiple traits inheritance

  class Crocodile extends Animal with Carnivore with Philosopher {
    override def eat(animal: Animal): Unit = println("I am eating you, animal!")
    override def ?! (thought: String) = println(s"I was thinking: $thought")
  }
  val aCrocodile = new Crocodile
  aCrocodile.eat(aDog)
  aCrocodile ?! "How wonderful if I could fly!"
  aCrocodile eat aDog // infix notation = object method argument, only available for methods with ONE argument

    //anonymous classes
  val dinosaur = new Carnivore {
    override def eat(animal: Animal): Unit = println("I am a dinosaur, so I can eat everything")
  }

  //singleton object
  object MySingletonObject{//the only instance of the Mysingleton type
    val mySpecialValue = 23324
    def mySpecialMethod():Int = 5393
    def apply(x:Int):Int = x+1
  }
  println(MySingletonObject.mySpecialMethod())
  println(MySingletonObject.mySpecialValue)
  println(MySingletonObject.apply(45))

  object Animal{//class Animal and object Animal are companion object
    //companions can access each other's  private field and methods
    // singleton Animal and instances of Animal are different things
    val canLiveInfinitely = false
  }
  val animalCanLiveForever = Animal.canLiveInfinitely //static fileds/methods
  println(animalCanLiveForever)

  //case class = lightweight data structures with some boilerplate.
  //when I created case class, the compiler automatically created the following for me:
  //-sensible equals and hash code
  //-serialization
  //-companion with apply
  case class Person(name:String, age: Int)
  //may be constrcuted without new
  val bob= Person("Bob", 54) //Person.apply ("Bob", 54)

  //exceptions
  try{
   //code that can throw
    val x:String = null
    x.length
  } catch {
    case e:Exception => "Some faulty error message"
  } finally {
    //execute some code no matter what

    //generics
    abstract class MyList[T]{
      def head: T
      def tail: MyList[T]
    }

    //using a generic with a concrete type
    val aList: List[Int] = List (1,2,3)
    val first = aList.head
    val rest = aList.tail
    println(first)
    println(rest)
    val aStringList:List[String] = List("Hello", "Scala", "!")
    println(aStringList.head)
    println(aStringList.tail)

    //point #1: in Scala, we usually operate with IMMUTABLE values/objects
    //Any modification to an object must return ANOTHER object
    /* Benefits:
    1)works miracles in multithreaded/distributed environment
    2)helps making sense of the code("reasoning about")
     */
    val reverseList= aList.reverse //return a new list
    println(reverseList)

    //point #2: Scala is closed to the OO ideal
    //every single piece of code is part of a class or object





  }










}
