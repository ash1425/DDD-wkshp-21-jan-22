package tw.workshop.ddd.bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private Address address;
    private final List<Account> bankAccounts;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
        this.bankAccounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        bankAccounts.add(account);
    }

    public void updateAddress(Address address) {
        this.address = address;
        for (Account account : bankAccounts) {
            account.updateAddress(address);
        }
    }
}
