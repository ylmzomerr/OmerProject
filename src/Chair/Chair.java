package Chair;

public abstract class Chair {
    String model;
    String color;
    double weight;

    public abstract void sit();

    public abstract void stepOnIt();

    public void chageCollor(String color){
        this.color=color;
    }

}
