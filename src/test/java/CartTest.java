import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Currency;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CartTest {

    @Test
    public void addIPodToCart() {
        Cart cart = new Cart();

        cart.addItem(new Product("IPad Pro", new Price(800, Currency.getInstance("USD"))), 2);

        assertEquals(cart.getItems().size(), 1);
        assertEquals(cart.getItems().get(0).getProduct().getName(), "IPad Pro");
        assertEquals(cart.getItems().get(0).getProduct().getPrice(), new Price(800, Currency.getInstance("USD")));
    }

    @Test
    public void addHeroInkPenToCart() {
        Cart cart = new Cart();

        cart.addItem(new Product("Hero Ink Pen", new Price(2, Currency.getInstance("USD"))), 2);

        assertEquals(cart.getItems().size(), 1);
        assertEquals(cart.getItems().get(0).getProduct().getName(), "Hero Ink Pen");
    }

    @Test
    public void addTwoQuantityOfBats() {
        Cart cart = new Cart();

        cart.addItem(new Product("GM Cricket Bat", new Price(100, Currency.getInstance("USD"))), 2);

        assertEquals(cart.getItems().size(), 1);
        Item item = cart.getItems().get(0);
        assertEquals(item.getProduct().getName(), "GM Cricket Bat");
        assertEquals(item.getQuantity(), 2);
    }

    @Test
    public void removeIpadProFromCart() {
        Cart cart = new Cart();

        cart.addItem(new Product("IPad Pro", new Price(800, Currency.getInstance("USD"))), 2);
        cart.removeItem(new Product("IPad Pro", new Price(800, Currency.getInstance("USD"))));

        assertTrue(cart.getItems().isEmpty());
        assertEquals(cart.getRemovedItemNames(), List.of("IPad Pro"));
    }

    @Test
    public void cartUniqueness() {
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        cart1.addItem(new Product("IPad Pro", new Price(800, Currency.getInstance("USD"))), 2);
        cart2.addItem(new Product("IPad Pro", new Price(800, Currency.getInstance("USD"))), 2);

        assertNotEquals(cart1, cart2);
        assertEquals(cart1, cart1);
    }
}
