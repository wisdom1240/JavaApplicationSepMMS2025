package bankingsystem;

public class BankingSystem {
    public static void main(String[] args) {

        // Create one SavingsAccount and one CurrentAccount
        SavingsAccount savings = new SavingsAccount
        ("SA001", "Alice Smith", 2000.0);
        CurrentAccount current = new CurrentAccount
        ("CA001", "Bob Johnson", 1500.0);

        System.out.println("=== Savings Account ===");
        savings.displayBalance();
        savings.deposit(500);
        savings.withdraw(300);
        savings.calculateInterest();
        System.out.println();

        System.out.println("=== Current Account ===");
        current.displayBalance();
        current.deposit(1000);
        current.withdraw(2000);
        current.calculateInterest();
        System.out.println();

        System.out.println("=== Final Balances ===");
        savings.displayBalance();
        current.displayBalance();
    }
}