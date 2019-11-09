package SearchInarrat;

import java.util.Arrays;

public class ArrayCopyof {
    public static void main(String[] args) {
        int[] arr={5,9,6,9};
        //int[] copy =new int[arr.length];
        int[] copy = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(copy));
    }
}
