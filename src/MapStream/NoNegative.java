package MapStream;

import java.util.*;
import java.util.stream.Collectors;

public class NoNegative {
    public static void main(String[] args) {
    ArrayList<Integer> nums=new ArrayList<>();
    nums.add(3);
        nums.add(-3);
        nums.add(22);
        nums.add(33);
        nums.add(-34);
        nums.add(243);


        System.out.println(nums);

        System.out.println(noNeg(nums));

        System.out.println(evenNumbers(nums));

    }
    public static List<Integer> noNeg(List<Integer> nums) {
        nums=nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
        return  nums;
    }
    public static List<Integer> evenNumbers(List<Integer> nums) {
        nums=nums.stream().filter(n -> n%2== 0).collect(Collectors.toList());
        return  nums;
    }

}
