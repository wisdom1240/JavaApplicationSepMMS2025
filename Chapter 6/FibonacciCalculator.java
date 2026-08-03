import java.util.Scanner;

public class FibonacciCalculator {
    public static double fibonacci(double n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        double prev = 0;
        double curr = 1;
        for (int i = 2; i <= n; i++) {
            double temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n to calculate Fibonacci(n): ");
        int n = input.nextInt();

        System.out.printf("Fibonacci(%d) = %.0f%n", n, fibonacci(n));
        
        // Demonstrating maximum double value test
        System.out.println("\nTesting limits with double...");
        int index = 0;
        while (true) {
            double val = fibonacci(index);
            if (Double.isInfinite(val)) {
                System.out.printf("Overflow occurs around n = %d%n", index);
                break;
            }
            index++;
        }
        input.close();
    }
}