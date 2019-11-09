import java.util.Arrays;

public class Zombie {
    public static void main(String[] args) {
        int[] inhabitants = {0, 6, 0, 4, 3, 2, 7, 0};

        for (int i = 0; ; i++) {
            System.out.println("Day" + i + Arrays.toString(inhabitants));
            int zeros = 0;
            for (int j = 0; j < inhabitants.length - 1; j++) {
                if(inhabitants[j+1] == 0){
                    inhabitants[j]/=2;
                    zeros++;
                    continue;
                }
                if(inhabitants[j] == 0){
                    inhabitants[j+1]/=2;
                    zeros++;
                    j++;
                    continue;
                }
            }
            if(zeros == 7) break;
        }
    }
}
