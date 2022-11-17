package commandDesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    List<Order> orders;
    public Broker(){
        orders=new ArrayList<>();
    }
    public void addOrder(Order order){
        orders.add(order);
    }
    public void placeOrders(){
        for (Order order:orders) {
            order.execute();
        }
        orders.clear();
    }
}
