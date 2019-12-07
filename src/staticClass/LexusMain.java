package staticClass;

public class LexusMain {
    public static void main(String[] args) {
        Lexus lxx=new Lexus("lx",2018);
        lxx.mileage=49000;
        lxx.evaluateCar(lxx);
        System.out.println((Integer.valueOf(lxx.date)-lxx.year));
    }



}
