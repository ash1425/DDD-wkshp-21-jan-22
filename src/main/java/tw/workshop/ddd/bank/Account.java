package tw.workshop.ddd.bank;

public class Account {
    private final String accountType;
    private Address address;

    public Account(String accountType, Address address) {
        this.accountType = accountType;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void updateAddress(Address address) {
        this.address = address;
    }
}
