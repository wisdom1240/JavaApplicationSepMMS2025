public class VariableLengthProduct {
    public static int product(int... numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Product of 2 and 3: " + product(2, 3));
        System.out.println("Product of 2, 3, and 4: " + product(2, 3, 4));
        System.out.println("Product of 1, 5, 7, 9: " + product(1, 5, 7, 9));
    }
}