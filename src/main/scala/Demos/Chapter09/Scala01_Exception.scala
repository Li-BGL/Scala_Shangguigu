package Demos.Chapter09

import java.io.FileInputStream

object Scala01_Exception extends App {
  //todo exception异常
  //java中有异常exception，错误error
  //exception是类
  //java中异常分为两大类：编译期异常&运行期异常
  //所有的异常其实都有对象，所有的对象都是运行时构建
  //所谓的异常其实就是为了提高程序的健壮性。
  //所谓的编译期异常其实就是根据异常的解决程度难易，提示给开发人员，也称之为提示性异常
  //如果提示了异常，但是没有处理（try catch），需要将异常推出throws

  //todo scala中的异常处理和java很相似，但有差异
  // scala中不对异常分类
  //异常存在范围的概念，所以捕捉异常也存在范围的概念

  new FileInputStream("xxxxxx")







}
