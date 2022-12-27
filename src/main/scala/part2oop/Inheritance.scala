package part2oop

object Inheritance extends App{
  class Animal {
    val creatureType="Wild!"
    def eat = println("YumYumYum")

  }

  class Cat extends Animal{
    def crunch = {
      eat
      println("Crunch Crunch")
    }
  }
  val cat= new Cat
  cat.crunch
  //Constructions

  class Person(name:String, age:Int) {
    def this(name:String) = this(name, 0)
  }
  class Adult(name:String,age:Int,idCard:String) extends Person(name)

//overriding: works for method, values and vals
//  class Dog extends Animal{
//  override def eat=println("Crunch,Crunch")
//  override val creatureType = "Domestic"
////}
//val dog = new Dog
//  dog.eat
//  println(dog.creatureType)

  class Dog (override val creatureType:String) extends Animal{
    override def eat={
      super.eat
      println("Crunch,Crunch")
    }
  }
   val dog= new Dog("K9")
   println(dog.creatureType)
   dog.eat
  //type substitution (broad:polymorphism)
  val unkownAnimal:Animal=new Dog("K9")
  unkownAnimal.eat
  //super
  //preventing overrides






}
