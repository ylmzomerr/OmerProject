package ArrayList;


import java.util.ArrayList;

public class Store {
    String name;
    String address;
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
    public void seeInventory(){
        for(Item item:this.listOfItems){
           item.infoPrint();
        }
    }

}
