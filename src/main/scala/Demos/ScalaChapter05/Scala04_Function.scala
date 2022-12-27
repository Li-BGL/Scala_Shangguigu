package Demos.ScalaChapter05

object Scala04_Function {
  def main(args: Array[String]): Unit = {
//函数的应用：声明和使用
//函数其实就是功能的封装，就意味着功能已经按照特定的规则封装好了，重点在如何调用
//  def headerUpper(s: String): String ={
//    return s.substring(0,1).toUpperCase()+s.substring(1)
//}
//    val newString: String = headerUpper("leonjayden")
//    println(newString)
    //函数式编程侧重点：函数名，输入参数，返回结果
    //todo 函数声明
    //1 无参数，无返回值
    def fun1(): Unit ={
      println("fun1 print")
    }
    fun1() //如果参数列表中没有任何参数，可以不加括号
    //fun1 //没有括号不可以！！！
    //2 无参数，有返回值
    def fun2():String={
      return "Leon"
    }
    val result= fun2()
    println(result)
    //3 有参数， no返回值
    def fun3(name:String):Unit= {
      println ("Name is: "+name)
    }
    fun3("Leon") //如果参数只有一个时名，也不能省略小括号，方法则可以省略作为运算符
    //4 有参数，you返回值
    def fun4(name: String): String={
      return "Name: " +name
    }
    val name= fun4("Jayden")
    println(name)

    //5 多参数，无返回值
    def fun5(name:String, age: Int): Unit={
      println("Name is: " + name + ", Age is: " + age)
    }
    fun5("Jayden", 11)
    //6 多参数，有返回值
    def fun6(name: String, age: Int): String = {
      return "Name is: " + name + ", Age is: " + age
    }

    val result6= fun6("Jayden", 11)
    println(result6)
  }
}
