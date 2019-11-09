package SearchInarrat;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        String str="It started to snow in Chicago";
        String[] strArr=str.split(" ");
        for(int i=0;i<=strArr.length-1;++i){
            for(int j=strArr[i].length()-1;j>=0;--j)
            {
                System.out.print(strArr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
