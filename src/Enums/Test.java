package Enums;

import javax.sql.rowset.WebRowSet;
import java.net.http.WebSocket;
import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;

enum Color{
    RED,Blue
}

public class Test {

    enum letterGrade{A,B,C,D,E,F}
    public static void main(String[] args) {
        Color newclr=Color.Blue;
        letterGrade grade=letterGrade.A;
        /* String str=Color.RED; */


        switch (grade){
            case A:
                System.out.println("High point");
                break;
            case B:
                System.out.println("Average");
                break;
            case F:
                System.out.println("you failed");
                break;
        }


    }
}
