package Methods;

import java.util.Scanner;

public class CheckTwoStrings {
    public static void main(String[] args) {
      CheckTwoStrings();
    }
    public static void CheckTwoStrings(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter First String");
        String first=input.nextLine();
        System.out.println("Please Enter second String");
        String second=input.nextLine();
        boolean check=false;
        while (check==false){
       check=first.contains(second);
        if(check==true){
            first=first.replace(second,"");
        }else{
            System.out.println("Please Enter second String again");
           second=input.nextLine();
        }}
        System.out.println(first);
    }
}
