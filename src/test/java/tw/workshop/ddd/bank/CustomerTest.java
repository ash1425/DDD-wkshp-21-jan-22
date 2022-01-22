package tw.workshop.ddd.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    @Test
    void updateAddress() {
        Address address = new Address("Coimbatore");
        Account savingsAccount = new Account("Savings", address);
        Account currentAccount = new Account("Current", address);
        Customer customer = new Customer("xyz", address);
        customer.addAccount(savingsAccount);
        customer.addAccount(currentAccount);

        customer.updateAddress(new Address("Pune"));

        Assertions.assertEquals(new Address("Pune"), savingsAccount.getAddress());
        Assertions.assertEquals(new Address("Pune"), currentAccount.getAddress());
    }
}
