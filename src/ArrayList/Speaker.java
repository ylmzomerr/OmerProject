package ArrayList;

import Methods.StringArray;

import java.util.ArrayList;

public class Speaker {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
       names.add("Ahmet");
        names.add("Omer");
        names.add("John");
        names.add("Rony");
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.isEmpty());
    }
}
