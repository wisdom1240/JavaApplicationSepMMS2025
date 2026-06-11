import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is Today: ");
        int Day = input.nextInt();
        
        switch (Day) {
            case 7:
                System.out.println("Today is Saturday!");
                break;
            case 6:
                System.out.println("Today is Friday!");
                break;
            case 5:
                System.out.println("Today is Thursday!");
                break;
            case 4:
                System.out.println("Today is Wednesday!");
                break;
            case 3:
                System.out.println("Today is Tuesday!");
                break;
            case 2:
                System.out.println("Today is Monday!");
                break;
            case 1:
                System.out.println("Today is Sunday!");
                break;
            default:
                System.out.println("That is not a day");
                break;
        }
    }
}