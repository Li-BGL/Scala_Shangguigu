package Demos.ScalaChapter04

object ForLoop_2 extends App {
  //TODO 循环返回值
  val result = for ( i <- 1 to 3){
    i
  }
  println(result) //Unit
  //todo 如果想要将集合中的数据进行处理后返回，可以采用特殊的关键字

  val result2 = for (i <- 1 to 3) yield{
    i*2
  }
  println(result2)
  //todo jave中线程对象有yield方法，在scala中如何调用
  Thread.`yield`()



}
