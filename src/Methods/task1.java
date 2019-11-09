package Methods;

public class task1 {
    public static void main(String[] args) {
       countwords("Bob wants to create a methods");
    }
    public static void countwords(String str ){
        String[] splitted=str.split(" ");
        System.out.println("The number of words in the sentence: "+splitted.length);
    }
}
