package part2oop

object Generics extends App {

  class MyList[+A]{
    //use the type A
    //def add(element:A):MyList[A]= ??? not working
    def add[B >:A](element:B):MyList[B] = ???
    //A=Cat
    //B=Animal
    //will return a list of animal not only cats
  }
  val listOfInts= new MyList[Int]
  val listOfStrings=new MyList[String]
// generic methods
  object MyList{
    def empty[A]:MyList[A] = ???
  }
  val emptyListOfInts=MyList.empty[Int]
  //Variance problems
  class Animal
  class Dog extends Animal
  class Cat extends Animal
  //1:yes. List [Cat] extends List[Animal] = covariance
  class CovariantList[+A]
  val animal:Animal=new Cat
  val animalList:CovariantList[Animal]=new CovariantList[Cat]

  //2: No= Invariance. List of Cat and List of Animal are two different things
  class InvarianceList[A]
 // val invarianceAnimalList:InvarianceList[Animal]=new InvarianceList[Cat] // this will not work, have to be animal
  val invarianceAnimalList:InvarianceList[Animal]=new InvarianceList[Animal]// this time it works

  //3. Hell No! contravariance
  class ContravariantList[-A]
  val contravariantList:ContravariantList[Cat]=new ContravariantList[Animal]//not work, animal can be dogs, and other animals

  class Trainer[-A]
  val trainer:Trainer[Cat]=new Trainer[Animal]

  //bounded types
  class Cage[A <: Animal] (animal: A)//A is subtype of animal
  val cage= new Cage(new Dog) //acceptable

  class Car
  //val newCage=new Cage(new Car) //this will not work as they are not the same type
  //expand MyList to be generic



}

