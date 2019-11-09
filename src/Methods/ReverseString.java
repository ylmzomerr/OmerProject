package Methods;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("ahmet"));

    }
    public static String reverseString(String str){
        int len=str.length();
        String reversed="";
        for(int i=0;i<len;++i){
            reversed=reversed+str.charAt((len-1)-i);
        }
        return reversed;
    }
}
