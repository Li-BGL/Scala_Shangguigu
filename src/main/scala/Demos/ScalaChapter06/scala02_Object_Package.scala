package Demos.ScalaChapter06

object scala02_Object_Package extends App {

  //todo Object oriented programming
  //todo java：
  //package: 包名的规则：域名的反写+项目的名称+模块的名称+程序的分类(分层)名称
  //域名是 www.atguigu.com
  //com.atguigu+gmall+user+util（service，bean）
  //com.atguigu.gmall.user.util
  //用途：1。为了分类管理  2。区分类（不同的package里面有相同的类，此时加上包用来区分
  //3。包的访问权限 4。包的路径和源码的存放路径相同
  //分析： 1，声明一个user，含义其实不确定，靠包其实是区分不开来的，最好见名知含义，类名起的准确一些
  // UserUtil，UserBean，UserService
  // DataUtil，DataBean，DataService
  //2。如果可以通过类名对类进行区分，那么其实包没有那么重要
  //3。 权限不好用，
  //4。 包语法在执行过程中，只要从classpath环境变量中可以查找到，就应该可以，所以和源码物理路径没关系
  //todo scala的package语法比java的语法更丰富
  //1。 package关键字可以多次声明（java中的点是从属关系）
  //package Demos.ScalaChapter06 其实就是package Demos
  //                                    package ScalaChapter06
  //2。可以给包设定作用域，体现上下级关系
  //3。将包也可以当做对象：package object ***
  // 包对象中声明的属性和方法，在当前包和他的子包都可以直接访问
  //scala中包名和物理路径没关系

  testPackageObject()




}
