import java.security.SecureRandom;

public class RandomSets {

    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        int a = 2 + 2 * randomNumbers.nextInt(5);   // a) 2,4,6,8,10
        System.out.println("a) " + a);

        int b = 3 + 2 * randomNumbers.nextInt(5);   // b) 3,5,7,9,11
        System.out.println("b) " + b);

        int c = 6 + 4 * randomNumbers.nextInt(5);   // c) 6,10,14,18,22
        System.out.println("c) " + c);
    }
}