package commandDesignPatterns;

public class BuyStock implements Order{
    Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
       stock.buy();
    }
}
