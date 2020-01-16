package Polymorpism2;

import java.time.*;
import java.time.LocalDateTime;

public class Park {
    public static void main(String[] args) {
        GermanShepard dog=new GermanShepard();

        Dog dog1=new GermanShepard();

        Animal dog3=new GermanShepard();

        Trainable dog4= new GermanShepard();
        dog4.trainable();
        dog.trainable();


        StringBuilder sb=new StringBuilder( 5 );
        
        System.out.println(sb.toString());

    }
}
