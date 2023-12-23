import java.util.ArrayList;
import java.util.List;

import Domain.Bottle;
import Domain.HotDrink;
import Domain.Product;
import Service.CoinDispenser;
import Service.Holder;
import Service.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> product = new ArrayList<>();
        
        Product product1 = new Product("Lays", 100, 0);
        Product product2 = new Product("Coca Cola", 5, 1);
        Product product3 = new Product("Milka", 80, 2);
        Product product4 = new Bottle("KhanKul", 50, 3, 0.5);
        Product product5 = new HotDrink("Latte", 120, 4, 60);
        Product product6 = new HotDrink("Hot Chocolate", 150, 5, 38);
        
        product.add(product1);
        product.add(product2);
        product.add(product3);
        product.add(product4);
        product.add(product5);
        product.add(product6);
        
        Holder holder1 = new Holder();
        CoinDispenser dispenser1 = new CoinDispenser();
        VendingMachine machine = new VendingMachine(holder1, dispenser1, product);
        
        for (Product prod : machine.getProduct()) {
            System.out.println(prod);
        }
    }
}
