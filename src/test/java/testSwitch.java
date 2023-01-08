public class testSwitch {
    public static void main(String[] args) {
        int age =10;
        //多重分支判断
        //会根据case进行数据匹配，匹配成功，执行对应的逻辑代码
        //如果匹配不成功，会继续匹配下一个case，以此类推
        //如果某一个case匹配成功，那么执行逻辑后，不使用break关键字，那么后续的case
        //即使不满足条件，也会执行，这个称之为switch穿越现象

        switch (age){
            case 10:
                System.out.println("age equals 10");
                break;
            case 20:
                System.out.println("age equals 20");
                break;
            default:
                System.out.println("Other");
                break;
        }
    }
}
