package tw.workshop.ddd.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items = new ArrayList<>();
    List<String> removedItemNames = new ArrayList<>();
    private boolean checkedOut;

    public void addItem(Product product, int quantity) {
        items.add(new Item(product, quantity));
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public void removeItem(Product product) {
        items = items.stream()
            .filter(item -> {
                if (item.getProduct().equals(product)) {
                    removedItemNames.add(product.getName());
                    return false;
                }
                return true;
            })
            .toList();
    }

    public List<String> getRemovedItemNames() {
        return removedItemNames;
    }

    public Order checkout() {
        checkedOut = true;
        return new Order(getFlattenedProducts());
    }

    private ArrayList<Product> getFlattenedProducts() {
        ArrayList<Product> products = new ArrayList<>();
        for (Item item : getItems()) {
            for (int i = 0; i < item.getQuantity(); i++) {
                products.add(item.getProduct());
            }
        }
        return products;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }
}
