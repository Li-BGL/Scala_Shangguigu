package Demos.ScalaChapter06

import java.lang.reflect.Field
import scala.beans.BeanProperty

object scala15_Object_Ext_1 extends App {

  //todo Object oriented programming - 比较两个对象
  // String.class =>类型信息=》class=》方法区
  //string类型的字符串为不可变字符串
  //string没有提供任何改变其内容的方法，但是可以通过反射修改
//  val name:String = " a b  "
//  name.trim
//  println("!"+name+"!") //name doesn't change

  val name:String = " a b  "
  val stringClass:Class[String] = classOf[String]
  val field: Field = stringClass.getDeclaredField("value")
  field.setAccessible(true)
  val charArray = field.get(name).asInstanceOf[Array[Char]]
  charArray.update(2,'c')

  println("!"+name+"!")




//  val value: Class[User]= classOf[User]
//  println(value)
//  println(value.getFields())

  class User{
//    val name: String = "Leon"
//    val age:Int= 8

  }

}
