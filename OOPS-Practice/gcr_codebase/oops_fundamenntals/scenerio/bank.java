package oops_practice.gcr_codebase.oops_fundamenntals.scenerio;

class BankAccount {
    private int accountNumber;
    private String holder;
    private double balance;

    static int totalAccounts = 0;

    BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void getStatement() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Holder Name: " + holder);
        System.out.println("Balance: " + balance);
    }
}

public class bank {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(101, "Rahul", 10000);
        BankAccount a2 = new BankAccount(102, "Priya", 15000);
        BankAccount a3 = new BankAccount(103, "Aman", 20000);

        a1.deposit(2000);
        a1.withdraw(1000);
        a1.deposit(500);
        a1.withdraw(3000);
        a1.deposit(1000);

        a2.deposit(1000);
        a2.withdraw(2000);
        a2.deposit(4000);
        a2.withdraw(1000);
        a2.deposit(2000);

        a3.deposit(3000);
        a3.withdraw(5000);
        a3.deposit(1500);
        a3.withdraw(1000);
        a3.deposit(500);

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);
    }
}