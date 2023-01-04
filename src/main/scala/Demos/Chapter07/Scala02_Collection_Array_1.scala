package Demos.Chapter07

object Scala02_Collection_Array_1 extends App {

  //todo 集合-数组
  //构建数组 String[] strs= new String[]{"1", "2", "3"} new的同时赋值
  //集合在构建时，希望同时增加数据，而不是构建后在增加
  //此时可以采用集合对象的特殊方法：apply
  val array: Array[Int] = Array.apply(1, 2, 3, 4) //编译时帮你new了
  println(array)
  println(array.mkString(","))
  //apply方法是可以被scala编译器自动识别的，可以省略
  val array1: Array[Int] = Array(1, 2, 3, 4)
  println(array1.mkString(","))

  //todo array其实是不可变数组，说明没有能力改变内容
  val array2 = Array(1,2,3,4)
  array2.+:(5)
  array2.:+(6)
  //添加数据不会改变自身，但是会产生新的数组
  val array3 = array2.+:(5)
  val array4 = array2.:+(6)
  println(array2)
  println(array3)
  println(array4)
  //内存地址不一样，所以是新的数组
  println(array2.mkString(","))
  println(array3.mkString(","))//51234
  println(array4.mkString(","))//12346
  //如果运算符采用冒号结尾，那么远算规则从右向左计算
  val array6= 5 +: array2
  val array7 = array2:+ 6
 val array8 = array3 ++: array4 //array + array 51234 12346
 println(array8.mkString(","))



}
