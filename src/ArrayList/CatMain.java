package ArrayList;

import java.util.ArrayList;
import java.time.*;
public class CatMain {
    public static void main(String[] args) {
        ArrayList<Cat> catsForSale=new ArrayList<>();
         Cat cat1=new Cat();
         cat1.age=3;
         cat1.color="White";

        Cat cat2=new Cat();
        cat2.age=4;
        cat2.color="Black";

        catsForSale.add(cat1);
        catsForSale.add(cat1);
         catsForSale.add(cat2);

         for(Cat onePrimitve:catsForSale){
              onePrimitve.info();

         }
         LocalDate datee=LocalDate.now();
        System.out.println(datee);

    }
}
