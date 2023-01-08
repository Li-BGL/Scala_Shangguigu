package Demos.Chapter08

object Scala03_Match extends App {
  //todo 模式匹配

  var a:Int =10
  var b:Int = 20
  var operator: Char = '*'
  var result = operator match
    case '+' => a+b
    case '-' => a-b
    case '*' => a*b
    case '/' => a/b
    case _ => "illegal"
  println(result)
}
