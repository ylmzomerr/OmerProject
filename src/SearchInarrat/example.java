package SearchInarrat;

import java.util.Arrays;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        String[] booksinlibrary={"Question in Mind","succes is a choice","love in heart"};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name of book you searching");
        String search=input.nextLine();
        Arrays.sort(booksinlibrary);
        int index= Arrays.binarySearch(booksinlibrary,search);
        if(index>=0){

            System.out.println("What do you want to replace ");
            booksinlibrary[index]=input.nextLine();
        }
        System.out.println(Arrays.toString(booksinlibrary));
    }
}
