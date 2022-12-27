package Demos

object helloWorld extends App{
    val name = "Mark"
    val age = 18
    println(name+" is " + age + " years old!")
    println(s"$name is $age years old!!")
    println(f"$name%s is $age%f years old!!!")
    println(s"Hello \nworld!")

    def demo (x: Int, y:Int): Unit={
      var res= ""
      if (x == 20 && y == 30){
        res = "x==20 && y==30"
      }
      else {
        res = "x!=20 && y!=30"
      }
      println(res)
    }
    demo(20,30)
    demo(21,30)
}


