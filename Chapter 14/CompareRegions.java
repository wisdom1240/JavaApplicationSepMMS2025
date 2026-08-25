import java.util.Scanner;

public class CompareRegions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        System.out.print("Enter starting index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter number of characters to compare: ");
        int length = scanner.nextInt();

        boolean match = str1.regionMatches(true, startIndex, str2, startIndex, length);

        if (match) {
            System.out.println("The specified regions are equal (ignoring case).");
        } else {
            System.out.println("The specified regions are NOT equal.");
        }
    }
}