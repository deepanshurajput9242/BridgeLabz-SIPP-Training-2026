package oops_practice.gcr_codebase.encapsulation_and_abstraction;

abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void displayAccountDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {

    private double monthlyBonusRate;

    public double getMonthlyBonusRate() {
        return monthlyBonusRate;
    }

    public void setMonthlyBonusRate(double monthlyBonusRate) {
        this.monthlyBonusRate = monthlyBonusRate;
    }

    double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}

public class BankingDemo {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();
        s.setAccountNumber("SB101");
        s.setHolderName("Rahul");
        s.setBalance(50000);
        s.setInterestRate(5);

        s.deposit(5000);
        s.withdraw(2000);

        s.displayAccountDetails();
        System.out.println("Interest: " + s.calculateInterest());

        System.out.println();

        CurrentAccount c = new CurrentAccount();
        c.setAccountNumber("CA102");
        c.setHolderName("Priya");
        c.setBalance(70000);
        c.setMonthlyBonusRate(3);

        c.deposit(10000);
        c.withdraw(5000);

        c.displayAccountDetails();
        System.out.println("Interest: " + c.calculateInterest());
    }
}