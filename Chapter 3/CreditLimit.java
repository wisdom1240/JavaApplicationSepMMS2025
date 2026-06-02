import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number (-1 to quit): ");
        int acc = input.nextInt();

        while (acc != -1) {
            System.out.print("Enter beginning balance: ");
            int balance = input.nextInt();

            System.out.print("Enter charges: ");
            int charges = input.nextInt();

            System.out.print("Enter credits: ");
            int credits = input.nextInt();

            System.out.print("Enter credit limit: ");
            int limit = input.nextInt();

            int newBalance = balance + charges - credits;
            System.out.println("New balance: " + newBalance);

            if (newBalance > limit)
                System.out.println("Credit limit exceeded");

            System.out.print("\nEnter account number (-1 to quit): ");
            acc = input.nextInt();
        }
    }
}