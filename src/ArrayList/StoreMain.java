package ArrayList;





public class StoreMain {
    public static void main(String[] args) {
        Store wallmart=new Store("Wallmart","1042 West ");
        Item item1=new Item("banana",32);
        Item item2=new Item("Apple",51);
        wallmart.addItem(item1);
        wallmart.addItem(item2);


        wallmart.seeInventory();
        wallmart.sellItem(item1);
        System.out.println();
        System.out.println("Total SAle"+wallmart.totalSales);
        wallmart.seeInventory();

        wallmart.returnItem("Tomato");
        System.out.println();
        System.out.println();
        System.out.println("Total SAle"+wallmart.totalSales);
        wallmart.seeInventory();

    }



}
