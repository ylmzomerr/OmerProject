import java.util.Arrays;

public class TeamActivity {
    public static void main(String[] args) {
        int[] inhabitants={8,9,8,1,3,8,3,4};
        int count0Cities=0;
        int day=0;
        System.out.println("Day "+day+" "+Arrays.toString(inhabitants));

        while (count0Cities<=8){
            day++;
            for(int i=0; i<inhabitants.length;i=i+1){
                inhabitants[i]=inhabitants[i]/2;
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
