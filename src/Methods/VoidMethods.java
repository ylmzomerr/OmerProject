package Methods;

public class VoidMethods {
    public static void main(String[] args) {
hello50();
oddnumbers();
goTo("Chiana", "Newyork");
    }
    public static void hello50(){
        for (int i=0;i<50;++i){
            System.out.println("Hello");
        }
    }
    public static void oddnumbers(){
        for (int i=0; i<100;++i){
            if(i%2==1){
                System.out.println(i);
            }

        }

    }
    public static void  goTo(String orgin,String newlocation){
        System.out.println("Yoy Start from "+ orgin);
        System.out.println("you are going to new location "+newlocation);
    }
}
