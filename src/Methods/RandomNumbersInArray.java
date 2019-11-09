package Methods;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbersInArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(RandomNumbersAdded(20,5)));
    }
    public static int[] RandomNumbersAdded(int size, int bound){
        int[] newIntArr=new int[size];
        Random random=new Random();
        for ( int count=0;count<size;++count){
           // newIntArr[count]=(int)(Math.random() * 500 + 1);
              newIntArr[count]=random.nextInt(bound) + 1;
        }
        return newIntArr;
    }
}
