import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeamActivity2revised {
    public static void main(String[] args) {
    int [] nums={1,2, 1, 1, 3,4,5,4,5,3,5,4,5};
        maxMirror(nums);
    }
    public static int maxSpan(int[] nums) {
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;

            while(nums[i] != nums[j])
                j--;

            int span = j - i + 1;

            if(span > max)
                max = span;
        }

        return max;
    }
    public static boolean dividesSelf(int n) {
        String str=n+"";
        int count=0;
        System.out.println(str);
        if(!str.contains("0"))
        for(int i=0; i<str.length();++i){
            if(n%Integer.valueOf(str.charAt(i)+"")==0){
                count++;}

        }
        System.out.println(count);
        if(count==str.length())
            return true;
        return false;
    }
    public List<Integer> doubling(List<Integer> nums) {
    ArrayList<Integer> newarr=new ArrayList<Integer>();
    for(int num:nums){
        newarr.add(num*2);
    }
    return newarr;
    }
    public static int maxMirror(int[] nums) {
        int leftside=0;
        int rigthside=0;
        for(int i=0; i<nums.length-1;++i){
            if((nums[i]+1)==nums[i+1]){
                leftside++;
            }
            if((nums[i]-1)==nums[i+1]){
                rigthside++;
            }
        }
        System.out.println(leftside);
        System.out.println(rigthside);
        if(leftside==rigthside)
            return leftside;
        return 0;
    }

}
