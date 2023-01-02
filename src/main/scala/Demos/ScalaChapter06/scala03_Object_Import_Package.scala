package Demos.ScalaChapter06

import java.util
import javax.xml.crypto.Data
import scala.collection.mutable

object scala03_Object_Import_Package extends App {

  //todo Object oriented programming
  //todo java：
  //import java.util.List
  //import java.util.* *并不是把包中所有的类拿来
  //import static java.util.Xxxxx.yyyyyy 静态导入
  //用途： 1：导入类 2： 静态导入
  //分析 1。scala
  //todo scala语言将java的语法进行了扩展
  //1。import是可以导包，java中是导类
  import Demos.ScalaChapter05
  ScalaChapter05.testPackageChapter05() //包名+函数
  //2。import关键字可以在任何地方使用，如果import放在最上面，全部都起作用
  // /但如果在当前位置，那么其他位置不起作用
  //3。 scala倒入一个包中所有的类，采用下划线代替java中的星号
  //4。 可以将一个包中的多个类，在同一行中导入
//  import java.util.List
//  import java.util.Map
//  import java.util.HashMap
//scala : import java.util.{List,Map,HashMap}
//5. 屏蔽类：如果不同的包中有相同名称类，可以通过屏蔽方式进行编译
//import java.util._
////import java.sql._// both util and sql include data,so block data in sql
//import java.sql.{Date=>_, _}
//
//new Date()
//6。 给类器别名: 下面这个hashmap因为java和scala都有，所以把java的取名javahashmap
//import java.util.HashMap
//import java.util.{HashMap=>JavaHashMap}
//
//val map= new JavaHashMap()

//7。 scala中的import规则
//以当前包为基准，导入指定子包中的类，如果找不到，再从顶级包中依次查找，需要采用特殊操作
//println(new util.HashMap())
println(new _root_.java.util.HashMap())

//8. 有些内容无需导入
// java中java。lang包中的类无需导入
// sala中java。lang包也无需导入
//scala中 scala包无需导入
//scala中 Predef对象的方法也无需导入，类似于静态导入 （predef预先声明），比如println







}
