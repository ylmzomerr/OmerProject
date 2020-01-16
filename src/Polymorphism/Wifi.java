package Polymorphism;

public interface Wifi {
    public abstract void searchWifi();

    public static void m() {
        System.out.println( "Static Method" );
    }

    public default void o() {
        System.out.println("Default method");
    }
}

