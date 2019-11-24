package ArrayList;

public class Cat {
    String color;
    int age;
    public void eat(){
        System.out.println("Cat is eating");
    }
    public void sleaping(){
        System.out.println("Cat is sleaping");
    }
    public void playing(){
        System.out.println("Cat is playing");
    }
    public void info(){
        System.out.print("["+this.color+" , "+this.age+"], ");
    }
}
