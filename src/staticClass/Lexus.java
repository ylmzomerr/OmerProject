package staticClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Lexus {


         String pattern = "yyyy";
         SimpleDateFormat simpleDateFormat =new SimpleDateFormat(pattern, new Locale("en", "USA"));

         String date = simpleDateFormat.format(new Date());




    String model,color;
    int price,year;

    double mileage;
    boolean newOrNot;
    static int totalNumberOfLexus;
    Lexus(String model,int year){
        this.model=model;
        this.year=year;
        totalNumberOfLexus++;
    }
    public double mileToKm(double mileage){
       return mileage*1.6;
    }
    public void evaluateCar(Lexus lexus){
        if((Integer.valueOf(this.date)-lexus.year)<=3&&lexus.mileage<=50000){
            System.out.println("Best Choice");
        }else   if((Integer.valueOf(this.date)-lexus.year)>3&&(Integer.valueOf(this.date)-lexus.year)<=7&&lexus.mileage>50000&&lexus.mileage<=100000){
            System.out.println("fair Choice");
        }else   if(lexus.mileage>100000&&lexus.mileage<=200000){
            System.out.println("You decide");
        }else   if(lexus.mileage>200000){
            System.out.println("Stay away");
        }
    }



}
