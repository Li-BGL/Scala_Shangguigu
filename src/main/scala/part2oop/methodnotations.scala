package part2oop

object methodnotations extends App {

  class Person(val name:String,favouriteMovie:String,val age:Int=0) {
    def likes(movie:String):Boolean= movie==favouriteMovie
    def hangOutWith(person: Person):String=s"${this.name} is hanging out with ${person.name}!"
    def unary_! :String=s"$name,what the heck?"

//    add an age to the Person class, add a unary+operator =>new person with the age+1
//mary => mary with the age incrementer
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def isAlive : Boolean= true
    def apply(): String = s"Hi, may name is $name, and I like $favouriteMovie"
//    overload the + operator. mary + nickname =>new person
    def +(nickname:String): Person=new Person(s"$name ($nickname)",favouriteMovie)
    def learn(method: String): String= s"$name learns $method!"
//    def learnScala(): String= learn("Scala")

    def learnScala= this learn "Scala"
    def apply(n:Int): String= s"$name watched $favouriteMovie $n times!"
  }

  val mary=new Person("Mary","Inception")
  val tom= new Person("Tom","Fight Club")
  println(mary.likes("Star Wars"))
  println(mary likes "Inception")
  println(tom.hangOutWith(mary))
  println(tom hangOutWith mary)
  println((mary + "the Rcokstar")())
  println(mary.learn("Scala"))
  println(mary.learnScala)
//  println(mary learn)

//  no parameters : postfix notation
  println(mary.unary_!)
  println(!mary)
  println(mary.isAlive)
//  println(mary isAlive) this doesn't work for me.
  println(tom.apply())
  println(mary())
  println((+mary).age)
  println(mary.age)
  println(mary.apply(2))
  println(mary(10))

  //infix notation= operator notation (only when there is one parameter)


  val x = -1
  val y=1.unary_-

}
