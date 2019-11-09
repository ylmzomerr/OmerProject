package Arrays;

public class StringOverload {
    public static void main(String[] args) {
        System.out.println(printString("ahmet","ali",2));
        printString("ahmet");
    }
    public static String printString(String word1,String add,int index){
        String newstr=word1.substring(0,index)+add+word1.substring(index,word1.length());
        return word1.charAt(0)+" "+ newstr;
    }
    public static void printString(String str){
        System.out.println(str);

    }

}
