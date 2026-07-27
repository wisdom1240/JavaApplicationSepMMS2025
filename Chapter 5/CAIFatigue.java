import java.security.SecureRandom;
import java.util.Scanner;

public class CAIFatigue {

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
                displayCorrectResponse();
                generateQuestion();
            } else {
                displayIncorrectResponse();
            }
        }
    }

    public static void generateQuestion() {
        number1 = randomNumbers.nextInt(9) + 1;
        number2 = randomNumbers.nextInt(9) + 1;
    }

    public static void displayCorrectResponse() {
        int choice = 1 + randomNumbers.nextInt(4);

        switch (choice) {
            case 1: System.out.println("Very good!"); break;
            case 2: System.out.println("Excellent!"); break;
            case 3: System.out.println("Nice work!"); break;
            case 4: System.out.println("Keep up the good work!"); break;
        }
    }

    public static void displayIncorrectResponse() {
        int choice = 1 + randomNumbers.nextInt(4);

        switch (choice) {
            case 1: System.out.println("No. Please try again."); break;
            case 2: System.out.println("Wrong. Try once more."); break;
            case 3: System.out.println("Don't give up! No."); break;
            case 4: System.out.println("Keep trying."); break;
        }
    }
}