package BridgeDesignPattern;

public class Simulator {
    public static void main(String[] args) {
        Vehicle car=new Car(new Make(),new Produce());
        Vehicle buss=new Buss(new Make(),new Produce());
        car.manufacture();
        buss.manufacture();
    }
}

