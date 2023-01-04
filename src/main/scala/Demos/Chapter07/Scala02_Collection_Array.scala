package Demos.Chapter07

object Scala02_Collection_Array extends App {

  //todo 集合-数组

  //java中数组不算是集合
  //java中集合有自己的类型。ArrayList<String>
  /*
  String[] strs = new String[3]
  */
  //scala是一个完全面向对象的语言，所以万物皆对象
  // 数组也是对象，也有自己的类型：Array
  //scala中array的本质就是java的数组【】
  //Scala中的中括号表示范型
  //todo 数组的基本操作
  //创建
  val array = new Array[String](3)
  // 增删改查,array其实是没有添加和删除的能力，只能修改数据，默认是null，通过索引的方式修改
  println(array)
  array(0) = "Leon"
  println(array(0))
  array(1) = "Jayden"
  println(array(1))
  array(2) = "Daddy"
  println(array(2))
  println(array)
// 查询数组中的数据，可以通过索引的方式
//可以直接将数组中的数据生产字符串
  println(array.mkString(","))
  //可以采用基本的for循环的方式
  for(str<- array){
    println(str)
  }
  // 采用面向对象的方法实现循环操作，foreach
  //foreach方法的作用就是将集合中的每一条数据进行处理
  //这里的处理逻辑是不固定的，有开发人员自行决定，scala集合帮开发人员将数据传递到逻辑
  //foreach方法的参数有一个，是函数：string=》unit
  def foreachFunction(str:String):Unit ={
    println("****"+str)

  }
  //将函数对象作为参数使用时，参数名称很重要，但是函数名称不重要
  //所以一般情况下，可以不写，可以用到匿名函数的自检原则，逐步简化
  array.foreach(foreachFunction)

  array.foreach(str=> println("****" + str))


}
