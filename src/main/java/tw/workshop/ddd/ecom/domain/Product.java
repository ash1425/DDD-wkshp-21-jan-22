package tw.workshop.ddd.ecom.domain;

import java.util.Objects;

public class Product {
    private final String name;
    private final Price price;
    private final int weight;

    public Product(String name, Price price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    public int getWeight() {
        return weight;
    }
}
