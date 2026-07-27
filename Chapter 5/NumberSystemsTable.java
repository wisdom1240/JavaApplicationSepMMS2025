public class NumberSystemsTable {

    public static void main(String[] args) {
        System.out.printf("%-8s%-12s%-8s%-8s%n", "Decimal", "Binary", "Octal", "Hex");

        for (int decimal = 1; decimal <= 256; decimal++) {
            System.out.printf("%-8d%-12s%-8s%-8s%n",
                    decimal,
                    Integer.toBinaryString(decimal),
                    Integer.toOctalString(decimal),
                    Integer.toHexString(decimal).toUpperCase());
        }
    }
}