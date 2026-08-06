
package abstractionassignment;


public class CreditCardPayment extends Payment {
    @Override 
    public void describe() {
        System.out.println("CreditCardPayment is a type of Payment");
    }
}
