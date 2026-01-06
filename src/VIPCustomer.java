// Дочерний класс VIPCustomer (VIP клиент)
public class VIPCustomer extends Customer {
    private double discountRate;

    public VIPCustomer(String name, String address, Account account, double discountRate) {
        super(name, address, account);
        this.discountRate = discountRate;
    }

    // Геттеры и сеттеры для discountRate
    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Discount Rate: " + discountRate;
    }
}
