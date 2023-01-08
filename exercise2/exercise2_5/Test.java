package exercise2.exercise2_5;

public class Test {
    public static void main(String[] args) {

        Customer customer1 = new Customer(233, "DinhPhu", 'm');
        System.out.println(customer1);
        Customer customer2 = new Customer(435, "DucQuy", 'm');
        Account account1 = new Account(0456, customer1, 9000.0);
        Account account2 = new Account(2323, customer2, 80000.0);
        System.out.println(account1);
        account1.deposit(300);
        System.out.println(account1);
        System.out.println(account1.withdraw(250));
        System.out.println(account1);

    }
}
