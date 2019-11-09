import java.util.*;

class Split {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        int count=0;
        for(int i=0;i<=(email.length()-1);++i){
            if(email.charAt(i)==64){count=count+1;}
        }
        if(count==0 && count>1){
            System.out.println("invalid email");
        }
        else{

            String[] arrOfStr = email.split("@", 2);

            for (String a : arrOfStr)
                System.out.println(a);
        }
    }
}
