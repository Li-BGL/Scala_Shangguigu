public class child extends parent{
    public String name = "child";

    public void test(){
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
