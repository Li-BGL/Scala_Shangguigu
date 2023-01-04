import java.util.ArrayList;
import java.util.List;

public class testcollection {
    public static void main(String[] args) {
//        ArrayList<Integer> aa = new ArrayList<>();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        //
//       nums.set() //修改
//        nums.get() //获取
        multiple2(nums);

        List<Integer> nums2 = newMultiple2(nums);
        System.out.println(nums2);
        System.out.println(nums);
    }
    // todo 自身集合不变，原始数据*2，赋值给新的list immutable


    private static List<Integer> newMultiple2(List<Integer> nums) {
        List<Integer> nums2 =new ArrayList<Integer>();
        for(Integer num: nums){
            nums2.add(num *2);
        }
        return nums2;
    }

    // todo 原始数据想要把每条数据乘以2，自身集合发生变化（可变）
    public static void multiple2(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            Integer num = nums.get(i);
            nums.set(i, num * 2);
        }
        System.out.println(nums);
    }




}
