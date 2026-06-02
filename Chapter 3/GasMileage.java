import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles, gallons;
        double totalMiles = 0, totalGallons = 0;

        System.out.print("Enter miles (-1 to quit): ");
        miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons: ");
            gallons = input.nextInt();

            double mpg = (double) miles / gallons;
            System.out.println("Miles per gallon: " + mpg);

            totalMiles += miles;
            totalGallons += gallons;

            System.out.print("\nEnter miles (-1 to quit): ");
            miles = input.nextInt();
        }

        if (totalGallons != 0)
            System.out.println("Overall MPG: " + (totalMiles / totalGallons));
    }
}