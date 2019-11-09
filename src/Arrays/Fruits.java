package Arrays;

public class Fruits {
    public static void main(String[] args) {
        String[] bread={"Bread", "cucumber", "Apples", "Orange", "cookies","Cake"};
        int count=0;
        for(String str:bread){
            //if(Character.isUpperCase(str))
            if(str.charAt(0)>='A'&&str.charAt(0)<='Z'){
                ++count;
            }

        }
        System.out.println(count);
    }
}
