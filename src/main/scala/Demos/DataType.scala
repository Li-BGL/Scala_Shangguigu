package Demos

import scala.reflect.ClassManifestFactory.Null

object DataType extends App {

  //Scala is OOP
  val age: Int = 10
  val b: Byte = 10
  val s: Short = 10
  val age1: Long = 10
  val age2: Float = 10
  val age3: Double = 10
  val age4: Char = 10
  val age5: Boolean = true

  //TODO Scala also have 2 types of data (AnyVal, AnyRef)
  def test(): Unit ={

  }
  // Unit, when print, return ()
  println(test())

  //TODO AnyRef: ScalaCollections, all java classes, other classes

  //AnyRef: Null
  val name: Null = null

  //nothing: not return anything 一般会应用于异常处理

  def test1(): Nothing = {
    throw new Exception()
  }




}
