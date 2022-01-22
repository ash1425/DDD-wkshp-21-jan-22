import java.util.Currency;
import java.util.Objects;

public class Price {
    private final double amount;
    private final Currency currency;

    public Price(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Price price = (Price) o;
        return amount == price.amount && Objects.equals(currency, price.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }
}
