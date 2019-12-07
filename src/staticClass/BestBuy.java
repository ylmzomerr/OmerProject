package staticClass;

public class BestBuy {
    String location;
   static int numberOfComputers;
   static {
       System.out.println("Static Block 1");
       numberOfComputers=50;

   }
    {
        System.out.println("This is code block");
    }
    static {
        System.out.println("Static Block 2");


    }
}
