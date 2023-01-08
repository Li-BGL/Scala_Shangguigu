package Demos.Chapter08

object Scala08_Match extends App{
  //todo 模式匹配-匹配对象
  //普通的对象无法在模式匹配中使用，因为对象的匹配其实是属性的匹配：unapply
  //obj=》unapply => field
  val thirdpart= User("Leon",8)
  thirdpart match
    case User("Leon",8) =>{
      println("this is the customer we want")
    }
    case _ => {
      println("not what we want")
    }

  class User{
    var age:Int= _
    var name:String=_
  }
  object User{
    def apply(name:String,age:Int): User = {
      val user=new User()
      user.age =age
      user.name =name
      user
    }

    def unapply(arg: User): Option[(String,Int)] ={
      Option((arg.name,arg.age))
    }
  }


}
