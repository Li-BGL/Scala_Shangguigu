package part2oop

object AnonymousClasses extends App {

  trait Animal{
    def eat:Unit
  }

  //anonymous class
  val funnyAnimal:Animal=new Animal{
    override def eat: Unit = println("HAHA, I am a funny animal!")

    //what it actual happens is:
    //class AnonymousClasses$$anon$1 extends Animal{
    //override def eat: Unit = println("HAHA, I am a funny animal!")
    //}
    // val funnyAnimal:Animal=new AnonymousClasses$$anon$1
    //
  }
  println(funnyAnimal.getClass)
  class Person(name:String){
    def sayHi:Unit=println(s"Hi, my name is $name, how can I help?")
  }
  val jim=new Person("Jim"){
    override def sayHi:Unit=println(s"Hi,my name is Jim, How can I help you?")
  }


}
