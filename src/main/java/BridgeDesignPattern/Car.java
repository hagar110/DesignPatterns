package BridgeDesignPattern;

public class Car extends Vehicle{

    public Car(WorkShop workshop1, WorkShop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    void manufacture() {
        System.out.print("in Car..");
        workshop1.work();
        workshop2.work();
    }
}
