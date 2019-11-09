package Sorting;
import java.util.Arrays;
public class sortingexample {
    public static void main(String[] args) {
        String[] arr={"z","b","a"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        arrtostring(arr);
    }
    public static void  arrtostring(String[] str){
        for (int i=0; i<str.length;++i){
            if(i==0){
                System.out.print("[");
                System.out.print(str[i]);
                System.out.print(",");
            }else if(i==str.length-1){

                System.out.print(str[i]);
                System.out.print("]");
            }else {
                System.out.print(str[i]);
                System.out.print(",");
            }

        }

    }
}
