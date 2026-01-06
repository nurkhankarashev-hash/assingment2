//
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Геттеры и сеттеры для name и accounts
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    // Переопределение toString()
    @Override
    public String toString() {
        return "Bank Name: " + name + ", Accounts: " + accounts.size();
    }

    // Метод для сортировки счетов по балансу
    public void sortAccountsByBalance() {
        accounts.sort((a1, a2) -> Double.compare(a2.getBalance(), a1.getBalance()));
    }

    // Метод для поиска счетов с балансом больше определенной суммы
    public List<Account> findAccountsAboveBalance(double amount) {
        return accounts.stream()
                .filter(account -> account.getBalance() > amount)
                .collect(Collectors.toList());
    }
}
