// Дочерний класс SavingsAccount (Сберегательный счет)
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Геттеры и сеттеры для interestRate
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Реализация метода депозита
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        }
    }

    // Реализация метода снятия средств
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Недостаточно средств.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Interest Rate: " + interestRate;
    }
}
