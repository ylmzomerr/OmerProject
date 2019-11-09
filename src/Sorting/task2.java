package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] numbers={23, 1, 34, 3, 54, 54, 51};
        Arrays.sort(numbers);
        System.out.println("biggest number"+numbers[numbers.length-1]);
        String checked = "";
        int count = 0;
        for(int i = numbers.length-1; i >= 0; i--) {
            if(count == 2) {
                break;
            }
            if(!checked.contains(numbers[i]+ "")) {
                System.out.println(numbers[i]);
                checked += numbers[i] + " ";
                count++;
            }

        }}}

