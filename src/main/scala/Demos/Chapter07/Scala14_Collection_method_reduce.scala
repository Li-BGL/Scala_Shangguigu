package Demos.Chapter07

import Demos.ScalaChapter06.scala08_Object_Instance.User

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.Source

object Scala14_Collection_method_reduce extends App {

  //todo 集合- 功能函数 -计算
  //集合不可能将所有的计算全部都封装，所以有些计算需要我们自己指定，然后由集合帮我们执行
  //将计算逻辑作为参数，传递给集合，由集合完成计算
  //todo 计算过程中，必须是两两计算
  //      两两计算完毕后，继续执行两两计算，迭代操作
  //      所有的数据参与计算之后，会得到总的结果
  val list= List(1,2,3,4)
  //reduce 方法可以实现自定义聚合计算
  //reduce需要传入函数类型参数：（A1,A1) =>A1
  //A1表示两两计算时，数据类型保持一致，且计算结果的类型也一致
  //返回值类型也是A1
  list.reduce(
    (x:Int,y:Int)=>{
      x+y
    }
  )

//reduce的底层操作就是reduceleft

  val result = list.reduce(_+_)
  println(result)
  val result1 = list.reduceLeft(_+_)
  val result2= list.reduceRight(_+_)
  println(result1)
  println(result2)

  //reduceRight的底层实现其实是
  //reversed.reduceLeft[B]((x, y) => op(y, x))
  //5，4，3，2，1
  //1-（ 2-（3-（4-5）））=1-（2-（3+1））=1-（-2）=3

  val result3 = list.reduceRight(_-_)
  println(result3) //从右边往左边减1-（ 2-（（3-4）））=1-（2+1）=-2

  val result4 = list.reduceLeft(_-_)
  println(result4) // 1-2-3-4 = -8
  //todo 如何区分reduceleft和reduceright
  //reduceleft：从左边括号
  //reduceright：左右边加括号







}
