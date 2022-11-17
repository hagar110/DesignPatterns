package CompositeDesignPattern;

public class Product implements ProductItem{
    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public String ItemType() {
        return "Product";
    }
}
