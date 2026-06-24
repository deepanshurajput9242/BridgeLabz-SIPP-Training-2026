package oops_practice.Scenerio_based;

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
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs." + amount +
                    " in Account " + accountNumber);
        }
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Overdraft not allowed in Account "
                    + accountNumber);
        } else {
            balance -= amount;
            System.out.println("Withdrawn Rs." + amount +
                    " from Account " + accountNumber);
        }
    }

    void getStatement() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Current Balance: Rs." + balance);
    }
}

public class Day10_Scenerio {

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(101, "Rahul", 10000);
        BankAccount a2 = new BankAccount(102, "Priya", 15000);
        BankAccount a3 = new BankAccount(103, "Aman", 20000);

        // 5 Transactions for Account 1
        a1.deposit(2000);
        a1.withdraw(1000);
        a1.deposit(1500);
        a1.withdraw(5000);
        a1.withdraw(9000);

        // 5 Transactions for Account 2
        a2.deposit(3000);
        a2.withdraw(2000);
        a2.deposit(1000);
        a2.withdraw(500);
        a2.withdraw(20000);

        // 5 Transactions for Account 3
        a3.deposit(4000);
        a3.withdraw(3000);
        a3.deposit(2500);
        a3.withdraw(1000);
        a3.withdraw(5000);

        // Print Statements
        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("\nTotal Accounts Created: "
                + BankAccount.totalAccounts);
    }
}