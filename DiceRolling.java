import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int[] counts = new int[13]; // Indices 2 to 12

        for (int roll = 1; roll <= 36_000_000; roll++) {
            int die1 = 1 + randomNumbers.nextInt(6);
            int die2 = 1 + randomNumbers.nextInt(6);
            counts[die1 + die2]++;
        }

        System.out.printf("%s%15s%n", "Sum", "Frequency");
        for (int sum = 2; sum < counts.length; sum++) {
            System.out.printf("%3d%15d%n", sum, counts[sum]);
        }
    }
}