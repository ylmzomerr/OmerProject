package Methods;

public class TimeFormat {
    public static void main(String[] args) {
        timeFormat(11,5,false);
    }
    public static void timeFormat(int hour,int min,boolean pm){
        if(hour>=0&&hour<12&&min>=0&&min<=59){
            if(pm==true){
                System.out.println(hour+" : "+min+" "+" AM");
            }else {
                System.out.println(hour+" : "+min+" "+" PM");
            }
        }else {System.out.println("Invalid Format");}
    }
}
