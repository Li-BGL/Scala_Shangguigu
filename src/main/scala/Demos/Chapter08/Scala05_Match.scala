package Demos.Chapter08

object Scala05_Match extends App {
  //todo 模式匹配-规则匹配
// val t =(1,"Leon",30)
//  val (id,name,age) = (1,"Leon",30)
//  println(id)
//  println(name)
//  println(age)
//
//  val map =Map(
//    ("a",1),("b",2),("c",3)
//  )
//  for(kv <-map){
//    if(kv._2 ==2) {
//      println(kv._1 + "=" + kv._2)
//    }
//  }
//for((k,2)<-map){
//  println(k+"="+2)
//}
val dataMap= Map(
  (("Melbourne","shoes"),2),
  (("Sydney","shoes"),4),
  (("Melbourne","computer"),3),
  (("Melbourne","car"),2),
  (("Sydney","clothes"),1),
  (("Sydney","computer"),5)
)
  //todo 小括号在匿名函数中表示参数列表，使用无法直接作为模式匹配的元组规则
  //        map的参数列表中只有一个参数，那么会发生错误
  //        如果想要使用模式匹配来匹配元组，需要使用关键词case 明确告诉编译起
  //小括号要变成大括号
  dataMap.toList.map{
    case((place,item),cnt)=> {
      (place, (item, cnt))
    }
    }.foreach(println)





}
