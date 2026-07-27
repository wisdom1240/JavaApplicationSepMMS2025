import java.util.Scanner;

public class RoundingNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a double value (or a non-number to quit): ");

        while (input.hasNextDouble()) {
            double x = input.nextDouble();
            double y = Math.floor(x + 0.5);

            System.out.printf("Original number: %.4f%n", x);
            System.out.printf("Rounded number: %.0f%n%n", y);

            System.out.print("Enter a double value (or a non-number to quit): ");
        }

        input.close();
    }
}