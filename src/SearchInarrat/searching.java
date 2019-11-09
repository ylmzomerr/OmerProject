package SearchInarrat;
import java.util.Arrays;
public class searching {
    public static void main(String[] args) {
        String[] arr = {"z", "b", "a"};
        int[] numbers = {2, 5, 7, 7,14};

        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, "b");

        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 9));
        System.out.println(Arrays.binarySearch(numbers, 15));
    }
}
