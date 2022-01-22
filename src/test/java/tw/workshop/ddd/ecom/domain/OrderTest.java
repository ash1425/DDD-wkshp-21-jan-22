package tw.workshop.ddd.ecom.domain;

import java.util.Currency;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderTest {

    @Test
    void shouldCalculateTotal() {
        Product pen = new Product("Pen", new Price(200, Currency.getInstance("INR")), 20);
        Product macbook =
            new Product("Macbook Pro", new Price(150000, Currency.getInstance("INR")), 2500);
        Order order = new Order(List.of(pen, macbook));

        double totalWithShipping = order.total();

        Assertions.assertEquals(150225.2, totalWithShipping);
    }
}