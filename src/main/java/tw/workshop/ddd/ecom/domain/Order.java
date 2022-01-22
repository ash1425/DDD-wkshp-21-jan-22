package tw.workshop.ddd.ecom.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Product> products;

    public Order(List<Product> products) {

        this.products = products;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public double total() {
        double totalPrice = 0, shippingCost = 0;
        for (Product p : products) {
            totalPrice = totalPrice + p.getPrice().getAmount();
            shippingCost = shippingCost + p.getWeight() * 0.01;
        }
        return totalPrice + shippingCost;
    }
}
