package Methods;

public class EvensInArray {
    public static void main(String[] args) {
        int[] IntArray={5,9,9,8,3,6,15,544,5};
        System.out.println(EvenNumbersInArray(IntArray));
    }
    public static int EvenNumbersInArray(int[] arr){
        int count=0;
        for (int intt:arr){
            if(intt%2==0){
                count++;
            }
        }
        return count;
    }
}
