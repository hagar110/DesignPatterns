package AdapterDesignPattern;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("wild turkey bark");
    }

    @Override
    public void FlyShortDistances() {
        System.out.println("wild turkey flying short distance");
    }
}
