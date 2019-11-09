package Methods;

import java.util.Arrays;

public class arrayToString {
    public static void main(String[] args) {
        int[] arr={-2,-5,9,6,-10};

        System.out.println(Arrays.toString(arr));
        arrayToString(arr);
    }
    public static void arrayToString(int[] arr){
        int i=1;
        for (int arr1:arr){
            if(i==1){
                System.out.print("["+arr1+", ");
            }else if(i==arr.length){
                System.out.print(arr1+"]");
            }else {
                System.out.print(+arr1+", ");
            }
            ++i;
        }

    }

}
