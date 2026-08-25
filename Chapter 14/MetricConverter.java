import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ask conversion query (e.g., 'How many inches are in 2 meters?'): ");
        String query = scanner.nextLine().toLowerCase();

        if (query.contains("inches") && query.contains("meters")) {
            double meters = extractDouble(query);
            System.out.printf("%.2f meters = %.2f inches%n", meters, meters * 39.3701);
        } else if (query.contains("liters") && query.contains("quarts")) {
            double quarts = extractDouble(query);
            System.out.printf("%.2f quarts = %.2f liters%n", quarts, quarts * 0.946353);
        } else {
            System.out.println("Error: Incompatible unit types or unknown units specified.");
        }
    }

    private static double extractDouble(String text) {
        String[] tokens = text.split("\\s+");
        for (String t : tokens) {
            try {
                return Double.parseDouble(t);
            } catch (NumberFormatException ignored) {}
        }
        return 1.0;
    }
}