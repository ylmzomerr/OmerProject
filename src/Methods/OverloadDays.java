package Methods;

public class OverloadDays {
    public static void main(String[] args) {
        DayName("Thuesday","Pazartesi");
        DayName("Friday","Omer",5);
    }
    public static void DayName(String day, String name){
        System.out.println(day+" : "+name);
    }
    public static void DayName(String day, String name,int times){
        for(int i=0; i<times;++i){System.out.print(day+" : "+name+" ");}
    }
}
