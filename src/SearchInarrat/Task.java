package SearchInarrat;
import java.util.Arrays;
public class Task {
    public static void main(String[] args) {
        int[] numbers={45,23,6,-3,66};
        System.out.println(Arrays.binarySearch(numbers,-3));
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers,-3));
    }
}
