package Methods;

public class task5 {
    public static void main(String[] args) {
     int[] arr={-2,-5,9,6,-10};
     negatifnuminArray(arr);
     negatifnuminArray2(4,-4,5);
    }
    public static void negatifnuminArray(int[] arr){

        for (int arr1:arr){
            if(arr1<0){
                System.out.println(arr1);
            }
        }
    }
    public static void negatifnuminArray2(int... arr){

        for (int arr1:arr){
            if(arr1<0){
                System.out.println(arr1);
            }
        }
    }
}
