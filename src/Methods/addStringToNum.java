package Methods;

import java.util.Arrays;

public class addStringToNum {
    public static void main(String[] args) {


        stringNumAdd("45687",2);
    }
    public static void stringNumAdd(String str,int num){

        int[] arr=new int[str.length()];
        String[] str2=str.split("");

        for(int i=0;i<str.length();++i){
            arr[i]=num+Integer.valueOf(str2[i]);
           // arr[i]=num+Integer.valueOf(str.charAt(i));
        }
        System.out.println(Arrays.toString(arr));
    }
}
