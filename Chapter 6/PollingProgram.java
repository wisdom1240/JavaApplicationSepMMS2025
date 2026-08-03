import java.util.Scanner;

public class PollingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] topics = {
            "Global Warming", 
            "Education Quality", 
            "Poverty Reduction", 
            "Healthcare Access", 
            "Data Privacy"
        };
        int[][] responses = new int[5][10];

        char choice = 'y';
        while (choice == 'y' || choice == 'Y') {
            System.out.println("\nPlease rate the following issues from 1 (least important) to 10 (most important):");
            for (int i = 0; i < topics.length; i++) {
                System.out.printf("%s: ", topics[i]);
                int rating = input.nextInt();
                while (rating < 1 || rating > 10) {
                    System.out.print("Invalid rating. Enter 1-10: ");
                    rating = input.nextInt();
                }
                responses[i][rating - 1]++;
            }

            System.out.print("Add another response? (y/n): ");
            choice = input.next().charAt(0);
        }

        System.out.println("\n-----------------------------------------------------------------------------");
        System.out.printf("%-20s", "Topic");
        for (int r = 1; r <= 10; r++) System.out.printf("%4d", r);
        System.out.printf("%10s%n", "Average");
        System.out.println("-----------------------------------------------------------------------------");

        int highestPoints = -1, lowestPoints = Integer.MAX_VALUE;
        String highestTopic = "", lowestTopic = "";

        for (int i = 0; i < topics.length; i++) {
            System.out.printf("%-20s", topics[i]);
            int totalPoints = 0;
            int totalVotes = 0;

            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", responses[i][j]);
                totalPoints += responses[i][j] * (j + 1);
                totalVotes += responses[i][j];
            }

            double avg = totalVotes > 0 ? (double) totalPoints / totalVotes : 0.0;
            System.out.printf("%10.2f%n", avg);

            if (totalPoints > highestPoints) {
                highestPoints = totalPoints;
                highestTopic = topics[i];
            }
            if (totalPoints < lowestPoints) {
                lowestPoints = totalPoints;
                lowestTopic = topics[i];
            }
        }

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("Highest Point Topic: %s (%d pts)%n", highestTopic, highestPoints);
        System.out.printf("Lowest Point Topic:  %s (%d pts)%n", lowestTopic, lowestPoints);

        input.close();
    }
}