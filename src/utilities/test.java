package utilities;

import java.math.BigInteger;

public class test {
    public static void main(String[] args) {
        BigInteger num1=new BigInteger( "3243243423432432432432" );
        BigInteger num2=new BigInteger( "3243243423432432432432" );
        num1=num1.add( num2 );
        System.out.println(num1);

    }
    public static String countLetters(String word){


        return null;
    }
    public static void doSum(int x, int y){
        System.out.println("Int sum "+(x+y));
    }
    public static void doSum(Integer x, Integer y){
        System.out.println("Integer sum "+(x+y));
    }
    public static void doSum(Double x, Double y){
        System.out.println("Double sum "+(x+y));
    }
    public static void doSum(Float x, Float y){
        System.out.println("Float sum "+(x+y));
    }

}
