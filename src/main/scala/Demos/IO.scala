package Demos
import java.io.PrintWriter
import scala.io.{BufferedSource, Source}

object IO extends App {
  // get input from control panel
  val age: Int = scala.io.StdIn.readInt()
  println(age)

  // get input from documents
  val source: BufferedSource = Source.fromFile("/Users/lzhao/Udemy-scala-beginners-master/Udemy-scala-learn/src/main/scala/Demos/world")
  val iter: Iterator[String]  = source.getLines()
  while (iter.hasNext){
    println(iter.next())
  }
  source.close()

  //TODO writer
  //Scala uses Java's writer
  val out = new PrintWriter("/Users/lzhao/Udemy-scala-beginners-master/Udemy-scala-learn/src/main/scala/Demos/world")

  out.println("Hello")
  out.println("Scala")
  out.println("Did I rewrite the text?")
  out.flush()

}
