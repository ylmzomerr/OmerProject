package Arrays;

public class Chicagoex {
    public static void main(String[] args) {
        String[] cties={"Chicago", "NewYork", "Madison", "Miami"," Washington"};
        int count=0;
        for(String cities:cties){
            if(cities.contains("Chicago")){

                ++count;
            }}
            if(count>0){
                System.out.println("Windy city found "+count);}
        else{
            System.out.println("Windy city not found ");
        }

        }
        }



