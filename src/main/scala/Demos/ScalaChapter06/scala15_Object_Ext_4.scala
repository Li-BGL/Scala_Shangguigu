package Demos.ScalaChapter06


object scala15_Object_Ext_4 {
  //type 定义新类型

  def main(args: Array[String]): Unit = {
    type myHashMap= java.util.HashMap[String,String]
    println(new myHashMap)
  }
  class HashMap{

  }
}
