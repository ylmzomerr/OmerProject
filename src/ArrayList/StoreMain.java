package ArrayList;





public class StoreMain {
    public static void main(String[] args) {
        Store wallmart=new Store("Wallmart","1042 West ");
        Item item1=new Item("banana",3);
        Item item2=new Item("Apple",5);
        wallmart.addItem(item1);
        wallmart.addItem(item2);
        wallmart.seeInventory();
    }



}
