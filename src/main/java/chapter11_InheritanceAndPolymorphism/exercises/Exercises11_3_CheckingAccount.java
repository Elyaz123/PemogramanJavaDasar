package chapter11_InheritanceAndPolymorphism.exercises;
import java.util.Date;

 class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    Account() {
        this(0, 0);
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String toString() {
        return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
                + "\nBalance: $" + String.format("%.2f", balance) +
                "\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
    }
}

class CheckingAccount
        extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
        super();
        overdraftLimit = -20;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("Error! Amount exceeds overdraft limit.");
    }

    public String toString() {
        return super.toString() + "\nOverdraft limit: $" +
                String.format("%.2f", overdraftLimit);
    }
}

public class Exercises11_3_CheckingAccount {
    public static void main(String[] args) {
        // Create Account, SavingsAccount and Checking Account objects
        Account account = new Account(1122, 20000);
        SavingsAccount savings = new SavingsAccount(1001, 20000);
        CheckingAccount checking = new CheckingAccount(1004, 20000, -20);
        // Set annual interest rate of 4.5%
        account.setAnnualInterestRate(4.5);
        savings.setAnnualInterestRate(4.5);
        checking.setAnnualInterestRate(4.5);

        // Withdraw $2,500
        account.withdraw(2500);
        savings.withdraw(2500);
        checking.withdraw(2500);

        // Deposit $3,000
        account.deposit(3000);
        savings.deposit(3000);
        checking.deposit(3000);

        // Invoke toString methods
        System.out.println(account.toString());
        System.out.println(savings.toString());
        System.out.println(checking.toString());
    }
}

class SavingsAccount
        extends Account {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println(
                    "Error! Savings account overdrawn transtaction rejected");
    }
}