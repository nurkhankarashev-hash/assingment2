import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Создание банковских счетов
        Account acc1 = new SavingsAccount("12345", 5000, 0.05); // Сберегательный счет
        Account acc2 = new CheckingAccount("67890", 10000, 2000); // Расчетный счет

        // Создание клиентов
        Customer customer1 = new VIPCustomer("Karashev Nurkhan", "123 Main St", acc1, 0.1);
        Customer customer2 = new Customer("Suingakiev Ali", "456 Oak St", acc2);

        // Создание банка и добавление счетов
        Bank bank = new NationalBank("Freedom Bank", "Kazakhstan");
        bank.addAccount(acc1);
        bank.addAccount(acc2);

        // Вывод информации о клиентах и банке
        System.out.println("Customer Information:");
        System.out.println(customer1);
        System.out.println(customer2);

        System.out.println("\nBank Information:");
        System.out.println(bank);

        // Применение фильтрации и сортировки
        System.out.println("\nAccounts sorted by balance:");
        bank.sortAccountsByBalance();
        bank.getAccounts().forEach(System.out::println);

        // Поиск счетов с балансом больше 6000
        List<Account> highBalanceAccounts = bank.findAccountsAboveBalance(6000);
        System.out.println("\nAccounts with balance above 6000:");
        highBalanceAccounts.forEach(System.out::println);

        // Операции с деньгами (депозит и снятие)
        System.out.println("\nPerforming operations on accounts:");
        acc1.deposit(1000); // Пополнение на 1000
        acc2.withdraw(500); // Снятие 500
        System.out.println(acc1); // Проверка баланса после пополнения
        System.out.println(acc2); // Проверка баланса после снятия
    }
}
