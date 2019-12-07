package Sorting;


import java.util.Arrays;

public class test {
    static String[] words={"banana","john","likes","key"};

    public static void main(String[] args) {

        System.out.println(containsSentence("john likes apple"));

    }
    public static boolean containsSentence(String sentence) {

        //TODO
        int count=0;
        String[]arr = sentence.trim().split(" ");
        String newsentence="";

        for(int i=0; i<words.length; i++){
            newsentence+=" "+words[i];


        }
        for (int j=0; j<arr.length; j++){

            if(newsentence.contains(arr[j])){
                count++;
            }

        }
        System.out.println(count);
        if (count==arr.length){
            return true;
        }else{
            return false;}
    }

    public String[] addWordArray(String word, String[] array) {

        // TODO
        String[] newwords=new String[array.length+1];
        for(int i=0;i<array.length;i++){
            newwords[i+1]=array[i];
        }
        newwords[0]=word;

        return newwords;
    }
    public String [] findAnagram(String word, String [] array) {

       String wordlowercase=word.toLowerCase();
       int count=0;
       int size=0;
       for(int i=0;i<array.length;++i){
           for(int j=0;j<wordlowercase.length();++j){
               if(array[i].length()==wordlowercase.length()&&array[i].toLowerCase().contains(wordlowercase.charAt(j)+"")){
                   count++;
               }
           }
           if(count==wordlowercase.length()){
               size++;

           }
           count=0;
       }

       /////
        String[] newarr=new String[size];
       size=0;
        count=0;
        for(int i=0;i<array.length;++i){
            for(int j=0;j<wordlowercase.length();++j){
                if(array[i].length()==wordlowercase.length()&&array[i].toLowerCase().contains(wordlowercase.charAt(j)+"")){
                    count++;
                }
            }
            if(count==wordlowercase.length()){
                newarr[size]=array[i];
                size++;

            }
            count=0;
        }
     return newarr;
    }
    public int[] sort(int[] array){
int temp=0;
for (int i=0;i<array.length;++i){
    for(int j=i+1;j<array.length;++j){
        if(array[i]>array[j]){
            temp=array[j];
            array[j]=array[i];
            array[i]=temp;
        }
    }
}
       return  array;
    }
}
