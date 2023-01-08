package Demos.Chapter10

import sun.security.util.Password

object Scala05_Transform extends App {
  //todo 隐式转换- 二次编译
  //注册用户

//设置默认密码为000000，如果想改为123123
//如果开发的时候明确知道，数值可能会改变，可以在参数上增加关键字implicit
//如果参数前面加了implicit，两个参数都改了。只能是一个

  def reg(implicit name:String,password: String ="000000"):Unit={

    println(s"the user is $name, and the password is $password")
  }

//  reg("Leon")

  implicit val newPassword: String = "123123"
  reg //只写reg，不要括号



}
