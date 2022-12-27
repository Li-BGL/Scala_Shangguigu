package Demos.ScalaChapter05

object Scala05_Function {
  def main(args: Array[String]): Unit = {
    //todo functional programming: easy version
    //函数的参数是没有限制个数，但是个数越多，传值越麻烦，并不推荐

    def fun1(
            name1: String,
            name2: String,
            name3: String,

            ):Unit={

    }
    //todo 参数个数的简化：可变参数*,类似于java中的...
    //在某些场景中，函数的参数可能不需要传递，也可能需要，暂时不确定
    //可变参数因为不确定，所以底层实现时，会采用数足集合实现ArraySeq
    def fun2(name:String*)={
      println(name)
    }
    fun2("Leon")
    fun2("Leon","Jayden","Dad")
    //todo 可变参数的位置, 必须放在参数列表的最后
    // only 1 可变参数 allowed
    def fun3(pswd:String, name:String*):Unit={

    }


  }
}
