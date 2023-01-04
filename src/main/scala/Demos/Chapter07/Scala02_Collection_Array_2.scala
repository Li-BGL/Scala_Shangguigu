package Demos.Chapter07

object Scala02_Collection_Array_2 extends App {

  //todo 集合-数组
  //多维数组 =》数组中有数组
  val myMatrix = Array.ofDim[Int](n1=4,n2 = 3) //n1 行，n2 列
  myMatrix.foreach(list => println(list.mkString(",")))

  //合并数组 concat
  val array1 = Array(1,2,3,4)
  val array2= Array(5,6,7)
  val array3 = Array.concat(array1,array2)
  println(array3.mkString(","))

  //创建指定范围数组
  val array4 = Array.range(0,3)
  array4.foreach(i=>println(i+",") )

  //创建并填充指定数量的数组,-1作为初始值
  val array5 = Array.fill[Int](5)(-1)
  array5.foreach(println)
}
