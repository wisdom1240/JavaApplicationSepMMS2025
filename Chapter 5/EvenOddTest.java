import java.util.Scanner;

public class EvenOddTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();

            if (isEven(number)) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }

            System.out.print("Continue? (y/n): ");
            choice = input.next();

        } while (choice.equalsIgnoreCase("y"));

        input.close();
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}