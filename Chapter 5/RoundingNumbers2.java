import java.util.Scanner;

public class RoundingNumbers2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double x = input.nextDouble();

        System.out.printf("Original value: %.5f%n", x);
        System.out.printf("Rounded to nearest integer: %.0f%n", roundToInteger(x));
        System.out.printf("Rounded to nearest tenth: %.1f%n", roundToTenths(x));
        System.out.printf("Rounded to nearest hundredth: %.2f%n", roundToHundredths(x));
        System.out.printf("Rounded to nearest thousandth: %.3f%n", roundToThousandths(x));

        input.close();
    }

    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}