package bankingsystem;

public class CurrentAccount extends BankAccount {

    private static final double OVERDRAFT_LIMIT = 1000.0; // can go negative up to this

    public CurrentAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (balance - amount < -OVERDRAFT_LIMIT) {
            System.out.println("Withdrawal denied: Overdraft limit exceeded.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        }
    }

    @Override
    public double calculateInterest() {
        // Current accounts typically don't earn interest
        System.out.println("Current accounts do not earn interest.");
        return 0.0;
    }
}