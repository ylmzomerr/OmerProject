package OOPCLASS;

import java.util.Scanner;

public class Book {
    String name;
    String author;
    int pages;
    public Book() {
    }

    public Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public void info() {
        System.out.println("Name " + this.name);
        System.out.println("Author " + this.author);
        System.out.println("Pages " + this.pages);
        System.out.println();
    }
    public Book[] getBooksInfo( int howmany){
        Book[] booksarr=new Book[howmany];
        Book books=new Book();
        Scanner input=new Scanner(System.in);

        for (int i=0; i<howmany;++i){
            booksarr[i]=books;
            System.out.println("Please Enter "+(i+1)+" Book Name");
            booksarr[i].name=input.nextLine();
            System.out.println("Please Enter "+(i+1)+" Book author");
            booksarr[i].author=input.nextLine();
            System.out.println("Please Enter "+(i+1)+" Book pages");
            booksarr[i].pages=input.nextInt();
            input.nextLine();
        }

        return booksarr;
    }

}
