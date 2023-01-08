package Demos.Chapter11

object Scala04_Generic_scala extends App {

  //todo 泛型的应用
//  val list:List[Int] = List(1,2,3,4)
//
//  list.map

  val list: List[User] = List(new User(), new User(), new User())
  val parent: Parent = list.reduce[Parent] {
    (p1, p2) => {
      p1
    }
  }
  println(parent)

  class Parent{

  }
  class User extends Parent{

  }
  class Child extends User{

  }


}
