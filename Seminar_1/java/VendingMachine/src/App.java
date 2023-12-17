import java.util.ArrayList;
import java.util.List;

import Domain.Bottle;
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
        Product product4 = new Bottle("Хан куль", 50, 3, 0.5);
        product.add(product1);
        product.add(product2);
        product.add(product3);
        product.add(product4);
        Holder holder1 = new Holder();
        CoinDispenser dispenser1 = new CoinDispenser();
        VendingMachine machine = new VendingMachine(holder1, dispenser1, product);
        for (Product prod : machine.getProduct()) {
            System.out.println(prod);
        }
    }
}
