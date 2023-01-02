package Demos.ScalaChapter06
//companion class
class scala04_Object_Class{

}

//companion object
object scala04_Object_Class extends App {

  //todo Object oriented programming

  //todo class: 一个源码文件中，类可以声明多个，但公共类只能一个，而且和源码文件名称一致
  //java:
  //public class User {}
  //2. 声明类，是为了抽取对象的相同的内容（模板），共性的东西
  //3。java中使用class声明类

  //scala和java的class的语法大同小异
  //1。scala源码中所有声明的类都可以是公共的
  //2. 使用object关键字也可以声明类，但是同时也会生产另外一个对象的类
  //主要目的是为了模拟静态语法，
  //todo 对象名称（类名）.方法
  //使用object关键字可以编译成两个文件，这两个类文件之间有关系
  //一般情况下，将java中的成员方法和属性声明在object声明类中
  //一般情况下，将java中的静态方法和属性声明在object声明另外一个类（$）中
  //todo object声明的类称之为半生类companion/checksumAccumlator类，object声明的对象为伴生对象companion object
  //半生类和伴生对象可以同时出现在一个源码文件中
  //Idea工具会动态识别伴生类和伴生对象（图标）











}
