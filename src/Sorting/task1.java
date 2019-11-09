package Sorting;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] numbers={31, 20, 25, 20, 3, 48, 26, 12};
        Arrays.sort(numbers);
        System.out.println("biggest number"+numbers[numbers.length-1]);
        System.out.println("Smallest number"+ numbers[0]);
    }
}
