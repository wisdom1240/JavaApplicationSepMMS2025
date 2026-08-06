
package abstractionassignment;


public class SavingsAccount extends BankAccount {
    @Override 
    public void describe() {
        System.out.println("SavingsAccount is a type of BankAccount");
    }
}
