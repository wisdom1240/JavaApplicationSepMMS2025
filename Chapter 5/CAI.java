import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {

    private static final SecureRandom randomNumbers = new SecureRandom();
    private static int number1;
    private static int number2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        generateQuestion();

        while (true) {
            System.out.printf("How much is %d times %d? ", number1, number2);
            int answer = input.nextInt();

            if (answer == number1 * number2) {
                System.out.println("Very good!");
                generateQuestion();
            } else {
                System.out.println("No. Please try again.");
            }
        }
    }

    public static void generateQuestion() {
        number1 = randomNumbers.nextInt(9) + 1;
        number2 = randomNumbers.nextInt(9) + 1;
    }
}