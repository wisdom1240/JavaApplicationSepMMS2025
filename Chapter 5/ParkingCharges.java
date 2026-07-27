import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;

        System.out.print("Enter the hours parked (or -1 to end): ");
        double hours = input.nextDouble();

        while (hours >= 0) {
            double charge = calculateCharges(hours);
            totalReceipts += charge;

            System.out.printf("Charge: $%.2f%n", charge);
            System.out.printf("Running total of receipts: $%.2f%n%n", totalReceipts);

            System.out.print("Enter the hours parked (or -1 to end): ");
            hours = input.nextDouble();
        }

        System.out.printf("%nTotal of yesterday's receipts: $%.2f%n", totalReceipts);
        input.close();
    }

    public static double calculateCharges(double hours) {
        double charge;

        if (hours <= 3.0) {
            charge = 2.00;
        } else {
            charge = 2.00 + Math.ceil(hours - 3.0) * 0.50;
        }

        if (charge > 10.00) {
            charge = 10.00;
        }

        return charge;
    }
}