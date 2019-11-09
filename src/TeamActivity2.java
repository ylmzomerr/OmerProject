import java.util.Arrays;
import java.util.Scanner;

public class TeamActivity2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] inhabitants={input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int count0Cities=0;
        int day=0;
        System.out.println("Day "+day+" "+Arrays.toString(inhabitants));

        while (count0Cities<=8){
            day++;
            for(int i=0; i<inhabitants.length-1;++i){
                if(inhabitants[i+1] == 0){
                    inhabitants[i]/=2;
                    i++;

                }
                if(inhabitants[i] == 0&&i<inhabitants.length-1){
                    inhabitants[i+1]/=2;
                    ++i;
                }
            }
            System.out.println("Day "+day+" "+Arrays.toString(inhabitants));

            count0Cities=1;
            for(int y=0; y<inhabitants.length;++y){
                if(inhabitants[y]==0){
                    count0Cities++;
                }
            }

        }
    }
}
