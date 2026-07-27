import java.util.Scanner;

public class MinimumTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three floating-point numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        System.out.printf("The smallest value is %.2f%n", minimum3(num1, num2, num3));

        input.close();
    }

    public static double minimum3(double x, double y, double z) {
        return Math.min(x, Math.min(y, z));
    }
}