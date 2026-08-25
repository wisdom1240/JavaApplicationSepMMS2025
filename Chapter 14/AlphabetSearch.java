import java.util.Scanner;

public class AlphabetSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = scanner.nextLine().toLowerCase();

        int[] counts = new int[26];

        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            int index = text.indexOf(c);
            while (index != -1) {
                count++;
                index = text.indexOf(c, index + 1);
            }
            counts[c - 'a'] = count;
        }

        System.out.printf("%-10s%-10s%n", "Letter", "Count");
        for (int i = 0; i < 26; i++) {
            System.out.printf("%-10c%-10d%n", (char) ('a' + i), counts[i]);
        }
    }
}