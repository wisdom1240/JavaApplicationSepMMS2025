import java.util.Scanner;

public class IntegerPower {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base (integer): ");
        int base = input.nextInt();

        System.out.print("Enter exponent (positive nonzero integer): ");
        int exponent = input.nextInt();

        long result = integerPower(base, exponent);
        System.out.printf("%d^%d = %d%n", base, exponent, result);

        input.close();
    }

    public static long integerPower(int base, int exponent) {
        long result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }
}