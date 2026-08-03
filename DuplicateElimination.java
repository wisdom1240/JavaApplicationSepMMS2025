import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int count = 0;

        while (count < 5) {
            System.out.printf("Enter number %d (between 10 and 100): ", count + 1);
            int val = input.nextInt();

            if (val >= 10 && val <= 100) {
                boolean duplicate = false;
                for (int i = 0; i < count; i++) {
                    if (numbers[i] == val) {
                        duplicate = true;
                        break;
                    }
                }

                if (!duplicate) {
                    numbers[count] = val;
                    count++;
                } else {
                    System.out.println("Duplicate number ignored.");
                }

                System.out.print("Unique values entered so far: ");
                for (int i = 0; i < count; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("Invalid input. Must be between 10 and 100.");
            }
        }
        input.close();
    }
}