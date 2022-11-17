package commandDesignPatterns;

public class Stock {
    String name;
    int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void buy(){
        System.out.println("stock "+name+" is bought");
    }
    void sell(){
        System.out.println("stock "+name+" is sold");
    }
}
