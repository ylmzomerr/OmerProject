package StringBuilder;
import utilities.MyCollection;

import java.lang.StringBuilder;
import java.util.ArrayList;

class StringBuilderr {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("John");

        System.out.println();
        System.out.println(str.append(" Bush"));
        System.out.println();

        System.out.println(str.insert(5," Jack "));
        System.out.println();
      String str1=str.toString();
        System.out.println(str1);


        System.out.println( palindrome(("aaaaa")));

        System.out.println();
        System.out.println(deleteWord("jonh.con---con","con"));
        System.out.println();
        System.out.println(deleteWord("jonh.con---con"));

        System.out.println();


    }
    public static boolean palindrome(String str){// This is String Data type
        StringBuilder str1=new StringBuilder(str);
       str1.reverse();
        System.out.println(str);
        System.out.println(str1);
        if(str.equals(str1.toString())){
            return true;
        }else{
            return  false;
        }

    }


    public static  StringBuilder deleteWord(String str) {
        StringBuilder newstr=new StringBuilder(str);
        int index=newstr.indexOf("con");
        if(index>=0){
            newstr.delete(index,index+3);
            return newstr;
        }

        return newstr;
    }


    public static  StringBuilder deleteWord(String str,String deleteStr) {
        StringBuilder newstr=new StringBuilder(str);
        int index=newstr.indexOf(deleteStr);
        if(index>=0){
            newstr.delete(index,index+3);
            return newstr;
        }

        return newstr;
    }
    public static ArrayList<String> insertWord(ArrayList<String> strArr){
       // ArrayList<String> newArr = new ArrayList<String>();

        for (int i=0; i<strArr.size();++i){
            if(strArr.get(i).length()%2==0){
               StringBuilder sb= new StringBuilder(strArr.get(i));
               sb.insert(strArr.get(i).length()/2,"HELLO");
               strArr.set(i,sb.toString());
            }

        }
        return strArr;
    }

    public static ArrayList<String> insertWord(ArrayList<String> strArr, String word){
        // ArrayList<String> newArr = new ArrayList<String>();

        for (int i=0; i<strArr.size();++i){
            if(strArr.get(i).length()%2==0){
                StringBuilder sb= new StringBuilder(strArr.get(i));
                sb.insert(strArr.get(i).length()/2,word);
                strArr.set(i,sb.toString());
            }

        }
        return strArr;
    }

    }
