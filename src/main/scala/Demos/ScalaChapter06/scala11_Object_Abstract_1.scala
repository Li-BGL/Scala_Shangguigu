package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala11_Object_Abstract_1 extends App {

  //todo Object oriented programming - 抽象
  //如果一个类中有抽象方法，那么这个类就是抽象类
  //如果一个类是抽象类，那么这个类不一定有抽象方法
  //如果父类方法为抽象方法，那么子类如果重写时，只需要补充即可，无需其他操作
  //如果父类的方法完整，那么子类的方法重写时，需要增加特殊的关键字override，明确方法的重写
 val a = new child()
  println(a.test())


  abstract class User{
    //todo 不完整的方法，只有声明没有实现
    def test():Unit ={
      println("user test。。。。")

    }
  }
  //在子类中构建完整
  class child extends User{
    override def test():Unit = {
      println("child test。。。。")

    }
  }


}
