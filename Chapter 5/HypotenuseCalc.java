import java.util.Scanner;

public class HypotenuseCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] triangles = { {3.0, 4.0}, {5.0, 12.0}, {8.0, 15.0} };

        for (double[] sides : triangles) {
            double result = hypotenuse(sides[0], sides[1]);
            System.out.printf("side1 = %.1f, side2 = %.1f -> hypotenuse = %.4f%n",
                    sides[0], sides[1], result);
        }

        System.out.println();
        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();

        System.out.printf("Hypotenuse = %.4f%n", hypotenuse(side1, side2));

        input.close();
    }

    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}