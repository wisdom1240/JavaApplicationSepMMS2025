import java.util.Scanner;

public class SeparatingDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();

        displayDigits(number);

        input.close();
    }

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int number) {
        int[] digits = new int[5];
        int count = 0;

        if (number == 0) {
            System.out.println(0);
            return;
        }

        int temp = number;
        while (temp > 0) {
            digits[count] = remainder(temp, 10);
            temp = quotient(temp, 10);
            count++;
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
            if (i != 0) {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}