package Methods;
import java.util.Arrays;
public class task2 {
    public static void main(String[] args) {
        int[] arr={5,9,6,9};
        //int[] copy =new int[arr.length];
        int[] copy = Arrays.copyOf(arr,arr.length);
        //System.out.println(Arrays.toString(copy));
        stringLen("dsakf",6);
    }
    public static void stringLen(String str, int len){
        if(str.length()==len){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}
