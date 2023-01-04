package Demos.ScalaChapter06

import scala.beans.BeanProperty

object scala15_Object_Ext extends App {

  //todo Object oriented programming - 比较两个对象
  //1。scala和jav中比较两个对象的内存的场景比较少
  //  比较两个对象都是内容（属性）的比较
  //2. scala中双等号比较其实就是非空equals判断，这里的equals判断默认就是比较内存
  // 但是一般情况下比较对象，都是重写equals方法，完成自定义的比较功能
  //3. 重写equals方法时，首先应该判断类型是否相同



  val user1= new User
  user1.id = 1001
  val user2= new User
  user2.id = 1001

  println(user1 == user2)


  class User{
    var id:Int = _

    override def equals(other: Any): Boolean = {
      if(other.isInstanceOf[User]) {
        val otherUser = other.asInstanceOf[User]
        this.id == otherUser.id
      }else {
        false
      }
    }
  }


}
