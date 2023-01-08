package exercise2.exercise2_5;

public class Account {
    private int ID;
    private Customer customer;
    private double balance = 0.0;

    public Account(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int ID, Customer customer) {
        this.ID = ID;
        this.customer = customer;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }   else System.out.println("Amount withdrawn exceeds the current balance!");
        return this;
    }

    public String toString() {
        return this.customer.toString() + " balance = $" + Math.round(this.balance * 100) / 100;
    }
}
