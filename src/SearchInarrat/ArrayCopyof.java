package SearchInarrat;

import java.util.Arrays;

public class ArrayCopyof {
    public static void main(String[] args) {
        int[] arr={5,9,6,9};
        //int[] copy =new int[arr.length];
        int[] copy = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(copy));
        System.out.println(isTitleWord("BUT"));

    }
    public static Boolean isTitleWord(String word) {
       if(!word.isEmpty()){
           word=word.toLowerCase();
           switch (word){
               case "a" : return false;
               case "an" :return false;
               case  "the" :return false;
               case  "and" :return false;
               case  "but" :return false;
               case  "for" :return false;
               case  "nor" :return false;
               case  "or" :return false;
               case  "so" :return false;
               case  "yet" :return false;
               case  "at" :return false;
               case  "by" :return false;
               case  "in" :return false;
               case  "into" :return false;
               case  "near" :return false;
               case  "of" :return false;
               case  "on" :return false;
               case  "to" :return false;
               case  "than" :return false;
               case  "via" :return false;




           }
       }

        return true;

    }
}
