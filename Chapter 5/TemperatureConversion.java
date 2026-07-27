import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1 to convert Fahrenheit to Celsius, "
                + "or 2 to convert Celsius to Fahrenheit: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter Fahrenheit temperature: ");
            int fahrenheitTemp = input.nextInt();
            System.out.printf("Celsius equivalent: %d%n", celsius(fahrenheitTemp));
        } else if (choice == 2) {
            System.out.print("Enter Celsius temperature: ");
            int celsiusTemp = input.nextInt();
            System.out.printf("Fahrenheit equivalent: %d%n", fahrenheit(celsiusTemp));
        } else {
            System.out.println("Invalid choice.");
        }

        input.close();
    }

    public static int celsius(int fahrenheit) {
        return (int) (5.0 / 9.0 * (fahrenheit - 32));
    }

    public static int fahrenheit(int celsius) {
        return (int) (9.0 / 5.0 * celsius + 32);
    }
}