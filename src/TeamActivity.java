import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TeamActivity {
    public String blogDb(ArrayList<String[]> r,String id)  {
        r= (ArrayList<String[]>) r.stream().filter( str->str.equals( id ) ).collect(Collectors.toList());
          String result= r.get( 1 ).toString() +r.get(2 ).toString();
        return result;

    }

    public static void main(String[] args) {
        TeamActivity m = new TeamActivity();
        ArrayList<String[]>  arr = new ArrayList<String[]>();
        arr.add(new String[]{"1","title 1","content"});
        arr.add(new String[]{"2","title 2","content"});
        arr.add(new String[]{"3","title 3","content3"});

        String post = m.blogDb(arr,"3");
        System.out.print(post);
        //should output:
        //title 3
        //content3


    }//end main
}
