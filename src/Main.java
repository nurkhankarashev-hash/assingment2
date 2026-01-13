import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("12345", 5000, 0.05); // Сберегательный счет
        Account acc2 = new CheckingAccount("67890", 10000, 2000); // Расчетный счет


        Customer customer1 = new VIPCustomer("Karashev Nurkhan", "Abai 1", acc1, 0.1);
        Customer customer2 = new Customer("Suingakiev Ali", "Abai 2", acc2);


        Bank bank = new NationalBank("Freedom Bank", "Kazakhstan");
        bank.addAccount(acc1);
        bank.addAccount(acc2);


        System.out.println("Customer Information:");
        System.out.println(customer1);
        System.out.println(customer2);

        System.out.println("\nBank Information:");
        System.out.println(bank);
        System.out.println("\nAccounts sorted by balance:");
        bank.sortAccountsByBalance();
        bank.getAccounts().forEach(System.out::println);


        List<Account> highBalanceAccounts = bank.findAccountsAboveBalance(6000);
        System.out.println("\nAccounts with balance above 6000:");
        highBalanceAccounts.forEach(System.out::println);


        System.out.println("\nPerforming operations on accounts:");
        acc1.deposit(1000);
        acc2.withdraw(500);
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
