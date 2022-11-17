package CompositeDesignPattern;

import AdapterDesignPattern.*;

public class Simulator {
    public static void main(String[] args) {
       Box mainBox=new Box();
       ProductItem product1=new Product();
        ProductItem product2=new Product();
        Box productBox=new Box();
        ProductItem product3=new Product();
        ProductItem product4=new Product();
        productBox.addProduct(product3);
        productBox.addProduct(product4);
        mainBox.addProduct(productBox);
        mainBox.addProduct(product1);
        mainBox.addProduct(product2);
        System.out.println(
                mainBox.getPrice()
        );
    }
}
