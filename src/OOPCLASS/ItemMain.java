package OOPCLASS;

import ArrayList.Item;

import java.util.Scanner;

public class ItemMain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int howmany=0;
        System.out.println("How many products you want to enter");
        howmany=input.nextInt();
        Item[] itemArr=new Item[howmany];
        Item item=new Item();
        for(int i=0;i<howmany;++i){
            itemArr[i]=item;
            itemArr[i]=itemArr[i].getInfo();
        }


        System.out.println();
        System.out.println();
        for(int i=0;i<howmany;++i){

            itemArr[i].infoPrint();
        }
    }
}
