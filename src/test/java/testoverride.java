public class testoverride {
    public static void main(String[] args) {
        //todo 方法重写
        //1. 应该存砸父子类关系，父类子类
        //2。父类的方法更有通用性，所以参数更灵活，重写的目的就是改变父类的逻辑，用在自己身上
        //3。 方法名相同，参数列表相同，异常不能超出父类的范围（总的异常范围）
        //4。 子类重写方法的权限不能低于父类的方法
        //5. 重写方法后，子类的方法可以代替父类方法使用
//        CC cc=new CC();
//        System.out.println(cc.sum()); //return 20
//
//        DD dd = new DD();
//        System.out.println(dd.sum()); //40
        //方法的重写其实就是在同一个内存区域中存在两个一样的方法，该如何区分？
        //jvm在调用对象的成员方法时，会遵循动态绑定机制
        //所谓的动态绑定机制，就是在方法运行时，将方法和当前运行对象的实际内存进行绑定
        //然后调用
        //动态绑定机制和属性没有任何关系，属性在哪里声明就在哪里使用

        CC cc1=new DD();
        System.out.println(cc1.sum());
        //先看dd里面有没有sum，没有，所以运行父类的sum
        //父类sum中有getI，而子类也有，所以此时，调用dd里面的getI是20，然后在sum就是30


    }
}
class CC{
    public int i=10;
    public int sum(){
        return getI()+10;
    }
    public int getI(){
        return i;
    }

}

class DD extends CC{
    public int i =20;
//    public int sum() {
//        return  i+20;
//    }
    public int getI(){
        return i;
    }

}