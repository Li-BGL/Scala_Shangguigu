package Demos.ScalaChapter06

import java.lang.reflect.Field
import scala.beans.BeanProperty

object scala15_Object_Ext_2 {
  def main(args: Array[String]): Unit = {
    //todo Object oriented programming - 比较两个对象
    println(Color.RED)
    println(Color.RED.id)

  }
//枚举类
  object Color extends Enumeration{
    val RED = Value(1, "red")
    val YELLOW = Value(2,"yellow")
    val BLUE = Value(3, "blue")

  }



}
