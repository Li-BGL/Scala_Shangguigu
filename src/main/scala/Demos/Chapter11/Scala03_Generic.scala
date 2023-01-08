package Demos.Chapter11

object Scala03_Generic extends App {

  //todo 泛型
  //Scala中的泛型和java中的大同小异
  //scala中的泛型也存在上限和下限的概念，但是不是采用关键字，而是采用颜文字



//  class Message[-T]{
//    val content: T =_
//
//  }
  //生产者的目的是为了生成对象，所以需要保证对象具有通用性，所以需要将类型想上查找
  //下限
  class Producer[T]{
    def produce(message: Message[_ >:T]) : Unit={

    }
  }




  //消费者的目的是为了消费数据，所以需要保证获取到的数据，功能不丢失，需要将类型向下查找
  //上限
//  class Consumer[T] {
//    def consume(): Message[_ <: T] = {
//
//    }
//  }

  class Parent{

  }
  class User extends Parent{

  }
  class Child extends User{

  }

}
