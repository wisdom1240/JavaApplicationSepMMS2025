import java.security.SecureRandom;

public class RandomRanges {

    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int n;

        n = 1 + randomNumbers.nextInt(2);          // a) 1 <= n <= 2
        System.out.println("a) n = " + n);

        n = 1 + randomNumbers.nextInt(100);        // b) 1 <= n <= 100
        System.out.println("b) n = " + n);

        n = randomNumbers.nextInt(10);             // c) 0 <= n <= 9
        System.out.println("c) n = " + n);

        n = 1000 + randomNumbers.nextInt(113);      // d) 1000 <= n <= 1112
        System.out.println("d) n = " + n);

        n = -1 + randomNumbers.nextInt(3);          // e) -1 <= n <= 1
        System.out.println("e) n = " + n);

        n = -3 + randomNumbers.nextInt(15);         // f) -3 <= n <= 11
        System.out.println("f) n = " + n);
    }
}