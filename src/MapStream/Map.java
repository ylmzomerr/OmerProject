package MapStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {

        List<Integer> nums=new ArrayList<>();
        nums.add(34);
        nums.add(3);
        nums.add(54);
        doubling(nums);
    }
    public static List<Integer> doubling(List<Integer> nums) {
        nums=nums.stream().map(x-> x*x).collect(Collectors.toList());
        System.out.println(nums);
        return nums;
    }
    public List<String> lower(List<String> strings) {
        strings=strings.stream().map(x-> x.replace("x","")).collect(Collectors.toList());
        return strings;

    }
}
