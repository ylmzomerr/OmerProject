package Methods;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(StringPalondrome("kayakk"));
    }
    public static String StringPalondrome(String str){
        String palindrome="";
        for(int i=0; i<str.length()/2;++i){
            if(str.charAt(i)==str.charAt((str.length()-1)-i)){
                palindrome="PALINDROME";
            }else {
                palindrome="Not palindrome";
            }
        }
        return palindrome;
    }
}
