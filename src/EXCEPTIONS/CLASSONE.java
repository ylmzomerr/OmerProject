package EXCEPTIONS;

public class CLASSONE {
    public static void main(String[] args) {
        String s="hello";
        try {
           // Dog.bark();
            System.out.println(s.charAt( 2 ));
            System.out.println(3/0);
           // Dog.bark();

        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }catch (ArithmeticException e){
            System.out.println("Invalid MAth");
        }finally {
            System.out.println("Thanks");
        }

        // it cannot work by itself out of catch try
       // Dog.bark();


    }
}
