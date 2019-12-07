package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class MagicNumber {
    ArrayList<Integer> listOfIntegers=new ArrayList<>();
    public void generateNumbers(int size){
        Integer temp;
        Random random=new Random();
        for(int i=0; i<size;++i){
            temp=random.nextInt(1000);
            listOfIntegers.add(temp);
        }

    }
    public void info(){
        for(Integer integer:listOfIntegers){
            System.out.print(integer+",  ");
        }

    }

}
