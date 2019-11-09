package Arrays;

import java.util.Arrays;

public class addToArray { public static void main(String[] args) {
    String [] arr = {"a","e","i","o"};
    System.out.println(Arrays.toString(increaseArray(arr,"u")));
    System.out.println(Arrays.toString(increaseArrayWithClass(arr,"u")));
    System.out.println(Arrays.toString(increaseArray(arr,"u",0)));
}
    public static String [] increaseArrayWithClass(String [] arr, String word) {
        String [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = word;
        return newArr;
    }
    public static String [] increaseArray(String [] arr, String word) {
        String [] newArr = new String[arr.length + 1];
        for(int i=0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = word;
        return newArr;
    }
    public static String[] increaseArray(String[] arr, String word, int index){
        String [] newArr = new String[arr.length + 1];
        for(int i=0; i < newArr.length-1; i++) {
            if(i<index){
            newArr[i] = arr[i];
            } else if(i==index){
                newArr[i]=word;
                newArr[i+1]=arr[i];
            }else {
                newArr[i+1]=arr[i];
            }
        }





        return newArr;
    }





}
