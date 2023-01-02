package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala11_Object_Abstract extends App {

  //todo Object oriented programming - 抽象
  //不完整的东西就可以理解为抽象的
  //抽象方法就是不完整的方法
  //抽象类就是不完整的类
  //类不完整，所以无法直接构建对象
  //如果想要构建对象，需要由子类继承后构建

  abstract class User{
    //todo 不完整的方法，只有声明没有实现，称之为抽象方法，那么类也不完整，就是抽象类，要增加abstract
    def test():Unit
  }
  //在子类中构建完整
  class child extends User{
    def test():Unit = {

    }
  }


}
