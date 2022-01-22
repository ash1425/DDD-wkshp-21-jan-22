package tw.workshop.ddd.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items = new ArrayList<>();
    List<String> removedItemNames = new ArrayList<>();

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
}
