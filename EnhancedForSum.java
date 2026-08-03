public class EnhancedForSum {
    public static void main(String[] args) {
        double total = 0.0;

        for (String arg : args) {
            total += Double.parseDouble(arg);
        }

        System.out.printf("Total sum of command-line arguments: %.2f%n", total);
    }
}