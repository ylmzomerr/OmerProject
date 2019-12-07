package ArrayList;

import java.util.Scanner;

public class Item {
    String name="";
    double price=0;
    public Item(){}
    public Item(String name,double price){
        this.name=name;
        this.price=price;
    }
    public void infoPrint(){
        System.out.println("The name of item : "+this.name+" Price : "+this.price);
    }
    public Item getInfo(){
        Scanner input=new Scanner(System.in);
        double price=0;
        String name="";

        System.out.println("Please Enter product name : ");
        name=input.nextLine();
        System.out.println("Please Enter product price : ");
        price=input.nextInt();
        Item item=new Item(name,price);
        return item;
    }
}
