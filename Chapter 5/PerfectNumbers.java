public class PerfectNumbers {

    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            if (isPerfect(number)) {
                displayFactors(number);
            }
        }
    }

    public static boolean isPerfect(int number) {
        int sum = 0;

        for (int factor = 1; factor <= number / 2; factor++) {
            if (number % factor == 0) {
                sum += factor;
            }
        }

        return (sum == number) && (number != 0);
    }

    public static void displayFactors(int number) {
        StringBuilder factors = new StringBuilder();
        int sum = 0;

        for (int factor = 1; factor <= number / 2; factor++) {
            if (number % factor == 0) {
                if (sum != 0) {
                    factors.append(" + ");
                }
                factors.append(factor);
                sum += factor;
            }
        }

        System.out.println(number + " is perfect. " + number + " = " + factors);
    }
}