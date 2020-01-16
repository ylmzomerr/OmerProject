package JavaTest;
import java.time.LocalDate;
import static JavaTest.Vowel.*;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

import  java.sql.*;
import java.util.Date;

public class Zoo {
    public static int howMany(boolean b, boolean... b2) {
        return b2.length; }
    public void roar(String roar1, String roar2) {
        roar1.concat("!!!");
        roar2.concat("!!!");
        System.out.println(roar1+" "+roar2);

    }

    public static void main(String[] args) {
       LocalDate date=LocalDate.of( 2013,2,3 );
       date=date.plusDays( 10 );
        System.out.println(date);
        Zoo zoo=null;
        zoo.roar( "Wq","Wqwq" );
        

        }
}

