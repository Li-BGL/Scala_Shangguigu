package part2oop

object Objects extends App{

//Scala does not have class level functionality("static")
  object Person {
  // static/class level functionality
  val N_EYES=2
  def canFly: Boolean=false
  //factory method
  //def from(mother:Person, father:Person): Person =new Person("Bobbie")
  def apply(mother:Person, father:Person): Person =new Person("Bobbie")
}
  class Person (val name:String) {
    // instance-level functionality

  }
  // companions
  //def main(args: Array[String]):Unit = {

    println(Person.N_EYES)
    println(Person.canFly)
    val mary = new Person("Mary")
    val john = new Person("John")
    //val Bobbie = Person.from(mary, john)
    val Bobbie = Person.apply(mary, john)
    println(mary == john)
  //}
// Scala application = Scala object with def main(args: Array[String]): Unit




}
