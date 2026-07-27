import java.util.Scanner;

public class MultipleTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter first integer: ");
            int num1 = input.nextInt();
            System.out.print("Enter second integer: ");
            int num2 = input.nextInt();

            if (isMultiple(num1, num2)) {
                System.out.println(num2 + " is a multiple of " + num1);
            } else {
                System.out.println(num2 + " is NOT a multiple of " + num1);
            }

            System.out.print("Continue? (y/n): ");
            choice = input.next();

        } while (choice.equalsIgnoreCase("y"));

        input.close();
    }

    public static boolean isMultiple(int num1, int num2) {
        return (num2 % num1 == 0);
    }
}