package AdapterDesignPattern;

public class MallardDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("Mallard duck flying");
    }

    @Override
    public void quack() {
        System.out.println("Mallard Duck quacking");
    }
}
