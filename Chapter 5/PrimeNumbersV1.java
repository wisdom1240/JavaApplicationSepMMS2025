public class PrimeNumbersV1 {

    public static void main(String[] args) {
        int count = 0;
        long testCount = 0;

        for (int number = 2; number < 10000; number++) {
            testCount++;
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Total primes found: " + count);
        System.out.println("Numbers tested: " + testCount);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}