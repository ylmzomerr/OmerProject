package ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    String name;
    String address;
    double totalSales;
    ArrayList<Item> listOfItems =new ArrayList<>();
    int numberOfItmes;
    public Store(String name,String address){
        this.name=name;
        this.address=address;


    }
    public void addItem(Item item){
        this.listOfItems.add(item);
        this.numberOfItmes++;
    }
    public void sellItem(Item item){
        if(this.listOfItems.contains(item)){
            totalSales+=item.price;
            listOfItems.remove(item);
            this.numberOfItmes--;
            System.out.println("Sale is successful");
        }
        else {
            System.out.println("It does not exist in the Inventory");
        }
    }

    public void returnItem(String itemname){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the price of Item");
        double price=input.nextDouble();

       Item item=new Item(itemname,price);
       listOfItems.add(item);
       totalSales-=price;
       numberOfItmes++;
    }
    public void addItem(){
        Scanner input=new Scanner(System.in);
        int number=0;
        System.out.println("How many items you want to enter");
        number=input.nextInt();
        input.nextLine();
        Item item=new Item();
        for (int i=1; i<=number;++i){
            System.out.println("please enter item name : "+i);
            item.name=input.nextLine();

            System.out.println("please enter item price : "+i);
            item.price=input.nextInt();
            input.nextLine();
        this.listOfItems.add(item);
        this.numberOfItmes++;
        }

    }
    public void seeInventory(){
        for(Item item:this.listOfItems){
           item.infoPrint();
        }
    }

}
