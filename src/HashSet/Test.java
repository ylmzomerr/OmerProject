package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> cars= new HashSet<>(  );
        cars.add( "BMV" );
        cars.add( "BMV" );

        cars.add( "BMV" );
        cars.add( "Toyota" );
        cars.add( "Lexus" );
        System.out.println(cars);


        List<String> toys=new ArrayList<>(  );
        toys.add( "Game" );
        toys.add( "Game" );
        toys.add( "Game" );
        toys.add( "Game" );
        System.out.println(toys);
        System.out.println(toys.get( 3 ));

        List<String> list=new ArrayList<>( cars );
        System.out.println(list);
    }
}
