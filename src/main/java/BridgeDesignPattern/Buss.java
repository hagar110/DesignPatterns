package BridgeDesignPattern;

public class Buss extends Vehicle{

    public Buss(WorkShop workshop1, WorkShop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    void manufacture() {
        System.out.print("in Buss..");
        workshop1.work();
        workshop2.work();
    }
}
