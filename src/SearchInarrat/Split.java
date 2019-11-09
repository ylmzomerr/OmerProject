package SearchInarrat;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String str="welcome to Java";
        String[] splitted=str.split(" ");

        char[] chararr=str.toCharArray();
        String arr=chararr.toString();

        System.out.println(Arrays.toString(splitted));

    }
}
