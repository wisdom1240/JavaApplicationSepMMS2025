import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] totalRanges = new int[9]; // Counters for 9 salary ranges

        System.out.print("Enter gross sales for salesperson (-1 to end): ");
        double grossSales = input.nextDouble();

        while (grossSales != -1) {
            int salary = (int) (200 + (0.09 * grossSales));
            System.out.printf("Salary: $%d%n", salary);

            int index = (salary - 200) / 100;
            if (index > 8) {
                index = 8;
            }
            if (index >= 0) {
                totalRanges[index]++;
            }

            System.out.print("Enter gross sales for salesperson (-1 to end): ");
            grossSales = input.nextDouble();
        }

        System.out.println("\nSalary Range Summary:");
        System.out.println("Range\t\t\tCount");
        System.out.println("$200–299\t\t" + totalRanges[0]);
        System.out.println("$300–399\t\t" + totalRanges[1]);
        System.out.println("$400–499\t\t" + totalRanges[2]);
        System.out.println("$500–599\t\t" + totalRanges[3]);
        System.out.println("$600–699\t\t" + totalRanges[4]);
        System.out.println("$700–799\t\t" + totalRanges[5]);
        System.out.println("$800–899\t\t" + totalRanges[6]);
        System.out.println("$900–999\t\t" + totalRanges[7]);
        System.out.println("$1000 and over\t" + totalRanges[8]);

        input.close();
    }
}