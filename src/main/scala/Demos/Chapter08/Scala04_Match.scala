package Demos.Chapter08

object Scala04_Match extends App {
  //todo 模式匹配-规则匹配
  //todo 匹配数组

//  def describe(x:Any): String ={
//    x match
//      case 5=> "Int five"
//      case "hello"=> "String Hello"
//      case true => "Boolean true"
//      case '+' =>"Char +"
//      case _ => "Error"
//
//  }
//如果所有规则不匹配，会查找下划线的分支
//但是如果想要使用下划线所代表的值，一般会给下划线起个名
//类型匹配时，不考虑范型的。Array除外，因为他的范型在运行时也有效

def describe(x: Any): String = {
  x match
    case i:Int => "Int"
    case s:String => "String"
    case m:List[_] => "List"
    case c:Array[Int] => "Array[Int]"
    case someThing => "something else" + someThing

}
  val result = describe("hello")
  println(result)




}
