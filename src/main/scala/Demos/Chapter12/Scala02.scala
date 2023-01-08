package Demos.Chapter12

object Scala02 extends App{
//  1.定义规则
  // 电话号码的校验规则
  //   1）全是数字字符串
  //   2）长度为11

  val regex="^\\d{11}$".r

  //2. 定义数据

  val str: String = "12345678901"
  println(isMobileNumber("12345678901"))

  def isMobileNumber(number:String):Boolean= {
    val regex = "^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))[0-9]{8}$".r
    val length=number.length

    regex.findFirstMatchIn(number.slice(length - 11, length)) != None
  }

  //3。 用规则校验数据
  val maybeString: Option[String] = regex.findFirstIn(str)

  if (maybeString.isEmpty) {
    println("Nothing matches")
  } else {
    println("Matches:" + maybeString.get)
  }


}
