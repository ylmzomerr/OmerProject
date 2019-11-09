package Methods;

import java.util.Arrays;

public class StringToNumbers {
    public static void main(String[] args) {
        System.out.println(DifferenceBetweenTwoNumbers("45329"));
    }
    public static int DifferenceBetweenTwoNumbers(String str){
        String[] charArr=str.split("");
       // Arrays.sort(charArr);
        //return charArr[last]-caharAarr[0];
        int biggestNum=Integer.valueOf(charArr[0]);
        int smallestNum=Integer.valueOf(charArr[0]);
        for(int i=0;i< charArr.length;++i){
            if(i<charArr.length-1){
            if(Integer.valueOf(charArr[i])<Integer.valueOf(charArr[i+1])){
                biggestNum=Integer.valueOf(charArr[i+1]);
            }else if(Integer.valueOf(charArr[i])>Integer.valueOf(charArr[i+1])){
                smallestNum=Integer.valueOf(charArr[i+1]);
            }}

        }
      return biggestNum-smallestNum;
    }
}
