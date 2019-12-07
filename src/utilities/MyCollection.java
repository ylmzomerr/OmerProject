package utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {
    public  ArrayList<String> getStringList(){
        ArrayList<String> newarr=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        String check="";
        while (check.equals("yes")) {
            System.out.println("Please enter word");
            newarr.add(input.nextLine() + " ");
            System.out.println("Do you want to continue y/n");
            check = input.nextLine();
        }
        return  newarr;
    }
}
