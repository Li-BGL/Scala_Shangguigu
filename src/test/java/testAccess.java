//public class testAccess {
//    public static void main(String[] args) {
//        AAA aaa = new AAA();
//        aaa.clone();
//        //clone is protected method, so不能用
//        //clone方法的提供者：java.lang.object
//        //clone方法的调用者：testAccess
//    }
//
//}
//    //todo 权限
//    //权限是什么 权力和限制
//    //权利的应用：用户和平台的关系 User Vip Superadmin
//    //java权利，以方法为例子，方法的提供者和方法调用者之间的关系，决定了权限
//    //1，priviate：私有的，同类能用
//    //2。default：包权限，同类能用，同包能用
//    //3。protected：受保护权限，同类，同包，子类
//    //4。public：公共，同类，同包，子类，所有类
//    //object
//
//class AAA{
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
