package OOPCLASS;

import java.util.Arrays;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Book books=new Book();
        int howmany=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter the books number You want to add");
        howmany=input.nextInt();
        Book [] booksarr=new Book[howmany];
        booksarr=books.getBooksInfo(howmany);
        for (int i=0; i<howmany;++i){
            booksarr[i].info();
        }


    }
}
