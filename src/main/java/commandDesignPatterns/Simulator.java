package commandDesignPatterns;

public class Simulator {
    public static void main(String[] args) {
        Stock stock1=new Stock("stock1",10);
        Stock stock2=new Stock("stock2",10);
        BuyStock buyStockOrder = new BuyStock(stock1);
        SellStock sellStockOrder = new SellStock(stock2);

        Broker broker = new Broker();
        broker.addOrder(buyStockOrder);
        broker.addOrder(sellStockOrder);

        broker.placeOrders();
    }
}
