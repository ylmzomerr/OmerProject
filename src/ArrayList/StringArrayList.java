package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class StringArrayList {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>(); arr.add("abc");
        arr.add("xxcv");

        for(String str:arr){
            if(str.equals("abc")){
                System.out.println(str);
            }
        }
    }
}
