package Cybertek;

import java.util.SortedMap;

public class firstclass {
    public static String helloname(String name){

        return "Hello "+name+"!";
    }
    public String maketag(String tag, String word){
        //String result="<"+tag+">"+word+"</"+tag+">";
        String result=String.format("<%s>%s</%s>",tag,word,tag);
        System.out.println(result);
        return result;

    }
    public static void main(String[] args) {
        System.out.println(helloname("ahmet"));

    }
}
