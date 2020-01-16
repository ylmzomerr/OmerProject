package Chair;

public class HumanScale extends  Chair implements Rollable,Collapsible{
    @Override
    public void sit() {
        System.out.println("Sitting on HumanSclae chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("Stepping on HumanSclae chair");

    }

    @Override
    public void lock() {
        System.out.println("HumanScale is locking");
    }

    @Override
    public void unlock() {
        System.out.println("HumanScale is unlocking");
    }

    @Override
    public void fold() {
        System.out.println("HumanScale is fold");
    }

    @Override
    public void unfold() {
        System.out.println("HumanScale is unfold");
    }

    @Override
    public void rollBack() {
        System.out.println("HumanScale is rollBack");
    }

    @Override
    public void rollForward() {
        System.out.println("HumanScale is rollForward");
    }
}
