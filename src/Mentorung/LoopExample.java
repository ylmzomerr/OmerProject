package Mentorung;

import java.util.Arrays;

public class LoopExample {
    public static void main(String[] args) {
        int[][] numbers= new int[10][10];
         for(int colum=1; colum<=10; ++colum){
             System.out.print("[");
             for(int row=1; row<=10; ++row){
                 if(row!=10) {
                     System.out.print(colum * row + ", ");
                 }else {

                 System.out.print(colum*row );
                 }
             }
             System.out.print("]");
             System.out.println();
         }
    }

}
