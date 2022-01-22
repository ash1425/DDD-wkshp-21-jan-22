package tw.workshop.ddd.domainService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriceEngineTest {
    @Test
    public void shouldReturnDiscountedAmount() {
        PriceEngine priceEngine = new PriceEngine();

        double discountedAmount = priceEngine.getPrice("Ipad Pro");

        assertEquals(90,discountedAmount);
    }
}
