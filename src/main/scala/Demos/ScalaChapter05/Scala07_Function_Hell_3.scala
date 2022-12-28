package Demos.ScalaChapter05

object Scala07_Function_Hell_3 {
  def main(args: Array[String]): Unit = {
    //todo functional programming: hell version
    //todo 将函数对象作为参数使用
    /* todo java:
     public void test (User u) {
             u.XXXXX;
    }
    User user= new User()
    test(user)
    */

    def fun():Unit = {
      println("test...")
    }

    def test (f: ()=>Unit):Unit = {
      f()
    }
    val f= fun _
    test(f)




  }
}
