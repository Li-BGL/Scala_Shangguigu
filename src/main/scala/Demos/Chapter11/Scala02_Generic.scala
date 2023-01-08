package Demos.Chapter11

object Scala02_Generic extends App {

  //todo 泛型
  //Scala中的泛型和java中的大同小异
  //1。java中的泛型使用是尖括号<>,scala中是【】
  //2. scala的泛型也是不可变的
  val message1: Message[User] = new Message[User]()
 // val message2: Message [User] = new Message[Parent]() //泛型不可变，所以这个父类不可以
 // val message3: Message[User] = new Message[Child]() //子类也不可以

 // 3。 泛型没有多态的概念：为了开发方便，整合概念，scala对范型进行了语法补充
 //   泛型+多态
 // 3。1 如果类型不变，但是泛型存在多态（父子关系），那么类型+泛型也存在多态（父子关系）
 // MessageUser  MessageChild 如果实现这样的功能，泛型发生了协变
 // 协变的基本语法，就在泛型的前面增加特殊符号 +
// val message4: Message[User] = new Message[Child]()
////
//  class Message[+T] {
//
//  }

// 3。2 如果类型不变，但是泛型存在 子父关系，，那么类型+泛型存在子父关系
//  如果实现这样的功能，泛型发生了逆变
  // 协变的基本语法，就在泛型的前面增加特殊符号 -
val message5: Message[User] = new Message[Parent]()

  class Message[-T]{

  }
  class Parent{

  }
  class User extends Parent{

  }
  class Child extends User{

  }

}
