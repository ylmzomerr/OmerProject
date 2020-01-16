package Polymorpism2;

public class GermanShepard extends Dog implements Trainable {
    @Override
    public void trainable() {
        System.out.println("Dog is trainable...");
    }
    void  breath(){
        System.out.println("GermanShepard is breeding...");
    }
}
