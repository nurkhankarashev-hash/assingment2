import java.util.ArrayList;
import java.util.List;

// Базовый класс Customer (Клиент)
public class Customer {
    private String name;
    private String address;
    private Account account;

    public Customer(String name, String address, Account account) {
        this.name = name;
        this.address = address;
        this.account = account;
    }

    // Геттеры и сеттеры для name, address и account
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer Name: " + name + ", Address: " + address + ", Account: " + account.toString();
    }
}
