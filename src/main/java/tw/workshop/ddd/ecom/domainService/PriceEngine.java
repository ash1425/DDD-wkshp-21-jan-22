package tw.workshop.ddd.ecom.domainService;

import tw.workshop.ddd.ecom.domain.Price;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class PriceEngine {

    private final Map<String, Price> competitorPrices = new HashMap<>();

    public PriceEngine() {
        competitorPrices.put("Ipad Pro", new Price(100, Currency.getInstance("USD")));
    }

    public double getPrice(String productName) {
        return competitorPrices.get(productName).getPrice() - competitorPrices.get(productName).getPrice() * 0.1;
    }
}
