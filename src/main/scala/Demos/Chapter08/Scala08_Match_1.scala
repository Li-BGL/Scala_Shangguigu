package Demos.Chapter08

object Scala08_Match_1 extends App{
  //todo 模式匹配-匹配对象
  //对象匹配需要增加一些特定的才可以实现
  // scala语言提供了一个简单的方式来实现这个匹配的过程
  //在class前面增加一个关键字：case，并且需要传递参数
  //todo case class：
  //     1。 样例类的构造参数会自动作为类的属性，默认不能改变，使用val声明
  //        如果需要改变，前面加var
  //     2。 样例类其实是普通类，只不过可以可以应用在模式匹配中匹配对象
  //     3。 case底层声明了半生对象，存在apply和unapply方法
  //     4。 样例类自动实现可序列化接口，重写方法，equals copy hashCode

  val thirdPart= User("Leon",9)

  thirdPart match
    case User("Leon",9) =>{
      println("this is the customer we want")
    }
    case _ => {
      println("not what we want")
    }

  case class User(name:String,age:Int)

//  object User{
//    def apply(name:String,age:Int): User = {
//      val user=new User()
//      user.age =age
//      user.name =name
//      user
//    }
//
//    def unapply(arg: User): Option[(String,Int)] ={
//      Option((arg.name,arg.age))
//    }
//  }


}
