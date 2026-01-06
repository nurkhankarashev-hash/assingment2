// Абстрактный класс Account (Счет)
public abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Геттеры и сеттеры
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Абстрактный метод для депозита (реализуется в дочерних классах)
    public abstract void deposit(double amount);

    // Абстрактный метод для снятия средств (реализуется в дочерних классах)
    public abstract void withdraw(double amount);

    // Переопределение toString(), equals(), hashCode()
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return accountNumber.equals(account.accountNumber);
    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }
}
