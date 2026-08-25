import java.util.Scanner;

public class CheckAmountInWords {
    private static final String[] tensNames = {"", " TEN", " TWENTY", " THIRTY", " FORTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
    private static final String[] numNames = {"", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter check amount (< 1000): ");
        double amount = scanner.nextDouble();

        int dollars = (int) amount;
        int cents = (int) Math.round((amount - dollars) * 100);

        System.out.println(convertLessThanOneThousand(dollars) + " and " + cents + "/100");
    }

    private static String convertLessThanOneThousand(int number) {
        String current;
        if (number % 100 < 20) {
            current = numNames[number % 100];
            number /= 100;
        } else {
            current = numNames[number % 10];
            number /= 10;
            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current.trim();
        return (numNames[number] + " hundred" + current).trim();
    }
}