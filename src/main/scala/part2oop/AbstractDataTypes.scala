package part2oop

object AbstractDataTypes extends App {

  //abstract
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "German Shepherd"

    def eat: Unit = println("Crunch Crunch")
  }

  //Traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    val creatureType: String = "croc"
    def eat: Unit = println("Nom Nom Nom")
    def eat(animal: Animal):Unit = println(s"I am a croc and I'a eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)
}