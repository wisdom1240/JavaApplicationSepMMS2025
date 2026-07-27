import java.security.SecureRandom;
import java.util.Scanner;

public class CAIDifficulty {

    private static final SecureRandom randomNumbers = new SecureRandom();
    private static int number1;
    private static int number2;
    private static int difficultyLevel;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter difficulty level (1 = 1-digit, 2 = 2-digit, etc.): ");
        difficultyLevel = input.nextInt();

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
        int lowerBound = (int) Math.pow(10, difficultyLevel - 1);
        int upperBound = (int) Math.pow(10, difficultyLevel) - 1;

        number1 = lowerBound + randomNumbers.nextInt(upperBound - lowerBound + 1);
        number2 = lowerBound + randomNumbers.nextInt(upperBound - lowerBound + 1);
    }
}