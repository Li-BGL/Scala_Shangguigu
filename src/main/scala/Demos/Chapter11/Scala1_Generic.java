package Demos.Chapter11;

import Demos.ScalaChapter06.scala14_Object_trait_2;
import test.Emp;

import java.util.ArrayList;
import java.util.List;

public class Scala1_Generic {
    public static void main(String[] args) {
        //todo java中的范型
        //todo 1。范型和类型的区别？
        //List ArrayList称之为类型，用于描述外部数据的类型
        //String 称之为范型，用于约束内部数据的类型
        //类型和范型不是一个层次上的东西
//        List<String> strList = new ArrayList<String>();
//        Message<String> message = new Message<String>();
//        final String content = message.content;
    }
        //todo 范型的声明方式
        //范型用于约束内部数据的类型，使用需要从外部传递到类的内部
        //所以有时将范型也称之为类型参数
        //如果参数没有传递，意味着没有传递范型，为了保证程序的健壮性，不会发生错误，会采用通用类型

        //todo 泛型用于进行内部数据类型的约束，在编译时有效，运行时无效
        // 称之为泛型擦除

        //todo 范型的应用时机，定义范型后，什么时候起作用
        //4.1 范型定义后，才会起作用，不会对之前代码起作用
        //4。2 范型在约束类型，意味着使用到了类型才会出现错误，否则不会出现错误
//
//        List list = new ArrayList();
//        list.add(new Emp());
//        List<User> userlist = new ArrayList<User>();
//        System.out.println(userlist);
//        for (User user:userlist) {
//            System.out.println(user);
//        }

        //todo 5 泛型和多态无关
//        List<String> list = new ArrayList<String>();
//        test(list);
////
//    }
//    public static void test(List<Object> list){
//        System.out.println(list);
        //todo 6 泛型不可变

//         Message<UserX> userMessage1 = new Message<>();
////        Message<UserX> userMessage1 = new Message<Parent>(); //(不可以）
////        Message<UserX> userMessage1 = new Message<Child>(); //（不可以）
//        // todo 7 如果泛型变化比较小，那么应用面比较窄，所以泛型可以扩大范围
//        //     使用过程中，泛型存在上限和下限的概念
//        //使用数据的时候，如果类型查找的过程中是往类的父类查找，表示使用通用性强的类型
//        //这个查找过程会存在下限的概念。
//        //todo 下限一般应用于生产者对象 super T
//        Producer<UserX> producer = new Producer<UserX>();
//        producer.produce(new Message<UserX>());
//        producer.produce(new Message<Parent>());//生产者父类可以
//        producer.produce(new Message<Child>());//子类不可以
//
//
//        //使用数据的时候，如果类型查找的过程中是往类的子类查找，表示使用功能不丢失
//        //这个查找过程会存在上限的概念
//        //todo 上线一般应用消费者对象 extends T
//        Consumer<UserX> consumer = new Consumer<UserX>();
//        consumer.consume();
//
//
//
//    }
//    class Consumer<T>{
//        public Message<extends T> consume();
//    }
//    class Producer<T>{
//        public void produce(Message<super T> message);
//    }
//    class Parent{
//
//    }
//    class UserX extends Parent{
//
//    }
//    class Child{
//
//    }
//
//}
    }