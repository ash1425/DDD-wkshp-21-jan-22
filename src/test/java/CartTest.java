import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CartTest {

    @Test
    public void addIPodToCart() {
        Cart cart = new Cart();

        cart.addItem(new Product("IPad Pro"), 2);

        assertEquals(cart.getItems().size(), 1);
        assertEquals(cart.getItems().get(0).getProduct().getName(), "IPad Pro");
    }

    @Test
    public void addHeroInkPenToCart() {
        Cart cart = new Cart();

        cart.addItem(new Product("Hero Ink Pen"), 2);

        assertEquals(cart.getItems().size(), 1);
        assertEquals(cart.getItems().get(0).getProduct().getName(), "Hero Ink Pen");
    }

    @Test
    public void addTwoQuantityOfBats() {
        Cart cart = new Cart();

        cart.addItem(new Product("GM Cricket Bat"), 2);

        assertEquals(cart.getItems().size(), 1);
        Item item = cart.getItems().get(0);
        assertEquals(item.getProduct().getName(), "GM Cricket Bat");
        assertEquals(item.getQuantity(), 2);
    }

    @Test
    public void removeIpadProFromCart() {
        Cart cart = new Cart();

        cart.addItem(new Product("IPad Pro"), 2);
        cart.removeItem(new Product("IPad Pro"));

        assertTrue(cart.getItems().isEmpty());
    }
}
