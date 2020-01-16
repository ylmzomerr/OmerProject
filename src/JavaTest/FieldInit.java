package JavaTest;

public class FieldInit {
    char c;
    boolean b;
    float f;
    void print(){
        System.out.println(c);
        System.out.println(b);
        System.out.println(f);
    }
/****
* //
*
*
*
* */
    public static void main(String[] args) {
        FieldInit f=new FieldInit();
        f.print();
    }
}
