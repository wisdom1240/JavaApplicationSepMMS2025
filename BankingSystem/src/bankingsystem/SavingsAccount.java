package bankingsystem;

public class SavingsAccount extends BankAccount {

    private static final double INTEREST_RATE = 0.04; // 4% interest
    private static final double MIN_BALANCE = 500.0;

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (balance - amount < MIN_BALANCE) {
            System.out.println("Withdrawal denied: Savings account must maintain minimum balance of " + MIN_BALANCE);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        }
    }

    @Override
    public double calculateInterest() {
        double interest = balance * INTEREST_RATE;
        System.out.println("Calculated Interest (Savings): " + interest);
        return interest;
    }
}