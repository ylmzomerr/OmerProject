package FinalAndMemory;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Bag {
    String color;
   final static int totalbags;
   static {
       totalbags=3;
       //totalbags=new Scanner(System.in).nextInt();
   }

    public static void main(String[] args) {

        String name="Jack";
        String str="Jack";
        System.out.println(name==str);
       String str2=new String("Jack");
        System.out.println(str==str2);
        String str3="Jack";
        System.gc();
        System.runFinalization();
        System.out.println(str==str3);
    }
}
