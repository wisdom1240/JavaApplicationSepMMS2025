import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] sales = new double[5][4]; // 5 products, 4 salespeople

        System.out.print("Enter salesperson (1-4), product (1-5), and sales amount (-1 to exit): ");
        int salesperson = input.nextInt();

        while (salesperson != -1) {
            int product = input.nextInt();
            double amount = input.nextDouble();

            if (salesperson >= 1 && salesperson <= 4 && product >= 1 && product <= 5) {
                sales[product - 1][salesperson - 1] += amount;
            }

            System.out.print("Enter next entry (-1 to exit): ");
            salesperson = input.nextInt();
        }

        System.out.println("\nSales Summary:");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%n", "Product", "Sp 1", "Sp 2", "Sp 3", "Sp 4", "Total");

        double[] colTotals = new double[4];

        for (int p = 0; p < 5; p++) {
            double rowTotal = 0;
            System.out.printf("Prod %-5d", p + 1);
            for (int s = 0; s < 4; s++) {
                System.out.printf("%-10.2f", sales[p][s]);
                rowTotal += sales[p][s];
                colTotals[s] += sales[p][s];
            }
            System.out.printf("%-10.2f%n", rowTotal);
        }

        System.out.printf("%-10s", "Total");
        double grandTotal = 0;
        for (int s = 0; s < 4; s++) {
            System.out.printf("%-10.2f", colTotals[s]);
            grandTotal += colTotals[s];
        }
        System.out.printf("%-10.2f%n", grandTotal);
        
        input.close();
    }
}