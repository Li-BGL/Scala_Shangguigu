package Demos.Chapter08

object Scala01_Match extends App {
  //todo 模式匹配
  //这里的匹配其实就是匹配数据的规则
  //这里的模式其实就是特定写法的规则 set XXXX
  //java中的语法：switch在scala中不存在，因为可以使用if语法代替
  //但是switch的判断数据的思路非常好，所以参考switch语法
  //scala增加了对数据进行数据校验的语法：模式匹配

  val age=20
  //scala中采用match关键字进行规则匹配
  // 每一个规则使用case进行声明，如果匹配成功，那么执行case后续的逻辑代码
  //代码执行完毕，匹配结束，不会有穿透，scala语言中没有break关键字
  //如果多个规则匹配不成功，可以使用下划线表示任意值，类似于default
  age match{
    case 10 =>{
      println("age equals 10")}
    case 20 =>{
      println("age equals 20")
    }
    case _ => {
      println("Other")

    }
  }


}
