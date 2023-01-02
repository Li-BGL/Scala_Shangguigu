public class javaOverCross {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        test(aaa);

        BBB bbb = new BBB();
        test(bbb);

        AAA aaa1 = new BBB();
        test(aaa1);

//        BBB bbb1 = new AAA();
//        test(bbb1);


    }
    public static void test(AAA aaa) {
        System.out.println("aaaaaaa");
    }
    public static void test(BBB bbb){
        System.out.println("bbbbbbb");
    }


}
class AAA {


}
class BBB extends AAA {


}
