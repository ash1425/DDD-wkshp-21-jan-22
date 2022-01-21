import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items = new ArrayList<>();

    public void addItem(Product product, int quantity) {
        items.add(new Item(product, quantity));
    }

    public List<Item> getItems() {
        return items;
    }
}
