package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Box implements ProductItem{
    List<ProductItem> products;
    public Box(){
        products=new ArrayList<>();
    }
    public void addProduct(ProductItem Item ){
        products.add(Item);
    }
    @Override
    public double getPrice() {
        double price=0;
        for(int i=0;i< products.size();i++){
            price+=products.get(i).getPrice();
        }
        return price;
    }

    @Override
    public String ItemType() {
        return "Box";
    }
}
