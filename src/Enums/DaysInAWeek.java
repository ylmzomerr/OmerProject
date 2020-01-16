package Enums;

public enum DaysInAWeek {
    Monday,Thuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
class DaysInAWeekkk{

    public  void daysInaWeek(DaysInAWeek day){
        switch (day){
            case Monday:
                System.out.println("Mondays are bad");
            case Thuesday:
                System.out.println("Regular Day");
            case Wednesday:
                System.out.println("Regular Day");
            case Thursday:
                System.out.println("Regular Day");
            case Friday:
                System.out.println("Fridays are great");
            case Saturday:
                System.out.println("Weekends are the best");
            case Sunday:
                System.out.println("Weekends are the best");
        }
    }

        }