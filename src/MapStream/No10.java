package MapStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class No10 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(3);
        nums.add(-3);
        nums.add(29);
        nums.add(33);
        nums.add(39);
        nums.add(243);

        System.out.println(noTeen(nums));


    }
    public static List<Integer> noTeen(List<Integer> nums) {
        nums=nums.stream().filter(x-> x<13 || x>19).collect(Collectors.toList());
        return nums;
    }
}
