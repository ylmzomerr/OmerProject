package Methods;

import java.util.Arrays;

public class task3 { public static void main(String[] args) {
    int[] arr={-2,-5,9,6,-10};
    replaceForNEG(arr,0);

}
    public static void replaceForNEG(int[] arr,int number){
     int i=0;
        for (int arr1:arr){
            if(arr1<0){
                arr[i]=number;
            }
            ++i;
        }
        System.out.println(Arrays.toString(arr));
    }

}
