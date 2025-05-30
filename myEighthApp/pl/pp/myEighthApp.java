package pl.pp;

public class myEighthApp {
    private String accountNumber;
    private String ownerName;
    private String email;
    private String phoneNumber;
    private double balance;

    // Constructor
    public myEighthApp(String accountNumber, String ownerName, String email, String phoneNumber, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Methods to credit and debit the account
    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposit of PLN %.1f was made. New balance PLN %.1f.%n", amount, balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew PLN %.1f from the account, Remaining balance = PLN %.1f%n", amount, balance);
        } else {
            System.out.printf("Insufficient funds. You have PLN %.1f in your account.%n", balance);
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        myEighthApp acc = new myEighthApp("001", "John Doe", "john@example.com", "1234567890", 1000.0);

        acc.withdraw(900.0);
        acc.deposit(250.0);
        acc.withdraw(50.0);
        acc.withdraw(500.0);
    }
}
