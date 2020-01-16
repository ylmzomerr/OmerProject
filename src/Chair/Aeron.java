package Chair;

public class Aeron extends  Chair implements Rollable {
    @Override
    public void sit() {
        System.out.println("sitting on Aeron chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("stepping on Aeron cha");

    }

    @Override
    public void rollBack() {
        System.out.println("Aeron is rollBack");
    }

    @Override
    public void rollForward() {
        System.out.println("Aeron is rollForward");
    }
}
