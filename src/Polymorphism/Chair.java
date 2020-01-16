package Polymorphism;

public class Chair {
    String model, color;
    int weight;

    void sit() {

    }

    void stepOnIt() {

    }

    void changeColor(String color){
        this.color=color;
    }



    public Chair(String model, String color, int weight) {
        this.model = model;
        this.color = color;
        this.weight = weight;
    }

}
