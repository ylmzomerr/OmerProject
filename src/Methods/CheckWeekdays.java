package Methods;

public class CheckWeekdays {
    public static void main(String[] args) {
        System.out.println(WeekdaysOrWeekand("sad"));

    }
    public static boolean WeekdaysOrWeekand(String str){
        if(str.equals("Monday")||str.equals("Tuesday")||str.equals("Wednesday")||str.equals("Thursday")||str.equals("fiday")){
            return true;
        }else if(str.equals("Saturday")||str.equals("Sunday")){
            return false;
        }else{
            return false;
        }


    }
}
