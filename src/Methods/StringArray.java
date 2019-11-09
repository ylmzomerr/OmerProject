package Methods;

public class StringArray {
    public static void main(String[] args) {

    }
    public static String[] StringArrayAdd(String[] StrArr, String str){
        String[] NewStrArr=new String[StrArr.length+1];
        NewStrArr[StrArr.length]=str;
        return NewStrArr;
    }

}
