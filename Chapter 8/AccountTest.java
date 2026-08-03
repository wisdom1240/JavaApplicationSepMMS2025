// File: AccountTest.java
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

        account1.deposit(25.50);
        System.out.printf("%s new balance: $%.2f%n", account1.getName(), account1.getBalance());
    }
}