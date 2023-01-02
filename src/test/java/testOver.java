public class testOver {
    public static void main(String[] args) {
        //方法的重载
        //1。 方法名称相同
        //2。 方法参数列表不同（个数，类型，顺序）

        InternetDataProvider internetDataProvider =new InternetDataProvider();
        getDataAndProcess(internetDataProvider); //bbbb

        DataProvider dataProvider = new InternetDataProvider();
        getDataAndProcess(dataProvider);



        LocalFileDataProvider localFileDataProvider = new LocalFileDataProvider();
        getDataAndProcess(localFileDataProvider); //aaaa

        //查找方法，以类型为基础进行查找，如果指定类型不存在，会扩大类型的范围继续查找
        //父类查找》 子类范围

    }
    public static void getDataAndProcess(DataProvider dataProvider) {
        String data = dataProvider.getData();
        System.out.println(data);
        System.out.println(data.toUpperCase());
    }
//    public static void test(BB bb){
//        System.out.println("bbbb");
//    }
}
class DataProvider {

    public String getData() {
        return "AAA";
    }

}
class InternetDataProvider extends DataProvider {
    @Override
    public String getData() {
        return "data got from internet";
    }

}

class LocalFileDataProvider extends DataProvider {
    @Override
    public String getData() {
        return "data got from local file";
    }

}
