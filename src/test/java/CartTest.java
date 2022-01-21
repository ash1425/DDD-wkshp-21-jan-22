import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CartTest {

    @Test
    public void addIPodToCart() {
        Cart cart = new Cart();

        cart.addItem(new Item("IPad Pro"));

        assertEquals(cart.getItems().size(), 1);
        assertEquals(cart.getItems().get(0).getName(), "IPad Pro");
    }

    @Test
    public void addHeroInkPenToCart() {
        Cart cart = new Cart();

        cart.addItem(new Item("Hero Ink Pen"));

        assertEquals(cart.getItems().size(), 1);
        assertEquals(cart.getItems().get(0).getName(), "Hero Ink Pen");
    }
}
