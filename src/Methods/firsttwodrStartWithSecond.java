package Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class firsttwodrStartWithSecond {
    public static void main(String[] args) {
        System.out.println(CheckFristInSecon("ahmetgulmez","ahmet"));
    }
    public static boolean CheckFristInSecon(String word1, String word2){
        int count= 0;
        for(int i=0; i<word2.length();++i){
            if(word1.charAt(i)==word2.charAt(i)){
                count++;
            }

        }
        if(count==word2.length()){return true;//word1.toLowerCase().startsWith(word2);
             }else {return false;}
     //  word1.toLowerCase().startsWith(word2);
    }
    public static boolean CheckFristInSecon(String word1, String word2,int num){
      //  String[] newArr=word1.split(word2);
        //System.out.println(Arrays.toString(newArr));
        //if(newArr.length-1==num){
        int count= 0;
        for(int i=0; i<word2.length();++i){
            String sub=word1.substring(i,i+word2.length());
            if(sub.equals(word2)){
                count++;
            }

        }
        if(count==num){return true;}else {return false;}


    }


}
