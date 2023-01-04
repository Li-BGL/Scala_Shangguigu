package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala14_Object_trait_3 extends App {

  //todo Object oriented programming - 特质执行顺序
  //类混入特质时，也存在钻石问题，但是scala采用了一种特殊方法来解决
  //1。为什么要混入特质：增加约束/功能的补充和叠加
  //2。如果混入了多个相同的功能，那么就需要一个执行顺序，否则出现错误
  //scala 如何解决钻石问题
  //将多个功能混入在一起，按照特定的执行顺序进行叠加调用
  //这里的特定执行顺序其实就是初始化顺序的反向操作
  //super关键字只在编译时用于关联父类，运行时无效

  val mysql= new MySQL
  mysql.operateData()

  trait Operate {
    def operateData(): Unit = {
      //todo data operate
      println("进行数据处理")
    }
  }

  trait database extends Operate{
    override def operateData(): Unit = {
      //todo: data operate
      print("向数据库中")
      super[Operate].operateData()//super 不是表示父类特质，而是叠加功能后的上一级
      //super后面加了operate，表示下一步执行Operate里面的内容
    }
  }
  trait Log extends Operate{
    override def operateData(): Unit = {
      //todo: data operate
      print("向日志文件中")
      super.operateData() //super 调用上一级的方法
    }
  }

//  class MySQL extends database with Log {
//
//  }
//  //向日志文件中向数据库中进行数据处理
//

  class MySQL extends Log with database {

  }
  //向数据库中向日志文件中进行数据处理



}
