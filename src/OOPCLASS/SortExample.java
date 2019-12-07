package OOPCLASS;

import java.util.Arrays;
import java.util.Scanner;

public class SortExample {


    public static void main(String[] args) {

        String[] strArr={ "Game of Thrones","Greys","Prison Break" ,"Doctor Who","Friends" };
        Arrays.sort(strArr);
        Arrays.binarySearch(strArr,"Greys");
        System.out.println(Arrays.toString(strArr));
    }

    public static void maxAndMinValues(int[] intArr){
        int max=0,min=0;
        for(int i:intArr){
            if(i<min)
                min=i;
            if(i>max)
                max=i;
        }
        System.out.println("MAx Number : "+max);
        System.out.println("Min Number : "+min);
    }//end yinput

}
