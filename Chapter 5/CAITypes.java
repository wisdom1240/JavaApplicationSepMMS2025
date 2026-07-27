import java.security.SecureRandom;
import java.util.Scanner;

public class CAITypes {

    private static final SecureRandom randomNumbers = new SecureRandom();
    private static int number1;
    private static int number2;
    private static int difficultyLevel;
    private static int problemType;
    private static char operatorSymbol;
    private static int correctAnswer;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter difficulty level (1 = 1-digit, 2 = 2-digit, etc.): ");
        difficultyLevel = input.nextInt();

        System.out.println("Choose problem type:");
        System.out.println("1) Addition  2) Subtraction  3) Multiplication  "
                + "4) Division  5) Random mixture");
        System.out.print("Enter choice: ");
        problemType = input.nextInt();

        generateQuestion();

        while (true) {
            System.out.printf("How much is %d %c %d? ", number1, operatorSymbol, number2);
            int answer = input.nextInt();

            if (answer == correctAnswer) {
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

        int type = (problemType == 5) ? (1 + randomNumbers.nextInt(4)) : problemType;

        number1 = lowerBound + randomNumbers.nextInt(upperBound - lowerBound + 1);
        number2 = lowerBound + randomNumbers.nextInt(upperBound - lowerBound + 1);

        switch (type) {
            case 1:
                operatorSymbol = '+';
                correctAnswer = number1 + number2;
                break;
            case 2:
                if (number2 > number1) {
                    int temp = number1;
                    number1 = number2;
                    number2 = temp;
                }
                operatorSymbol = '-';
                correctAnswer = number1 - number2;
                break;
            case 3:
                operatorSymbol = '*';
                correctAnswer = number1 * number2;
                break;
            case 4:
                if (number2 == 0) {
                    number2 = 1;
                }
                number1 = number2 * (1 + randomNumbers.nextInt(10));
                operatorSymbol = '/';
                correctAnswer = number1 / number2;
                break;
        }
    }
}