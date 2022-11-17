package AdapterDesignPattern;

public class Simulator {
    public static void main(String[] args) {
        Duck mallardDuck=new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();
        Turkey turkey=new WildTurkey();
        Duck turkeyAdapter=new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}
