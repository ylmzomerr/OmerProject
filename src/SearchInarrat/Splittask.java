package SearchInarrat;
import java.util.Arrays;
public class Splittask {
    public static void main(String[] args) {
        String str="rite a program that creates a group of given size thisisabigword";
        String[] strarray=str.split(" ");
        String bigword="";
        int lengt=strarray[0].length();
        for(String strx:strarray){
            if(lengt<=strx.length()){
                lengt=strx.length();
                bigword=strx;
            }
        }
        System.out.println(bigword);
    }
}
