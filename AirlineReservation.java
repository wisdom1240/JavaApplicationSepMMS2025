import java.util.Scanner;

public class AirlineReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[10];

        while (true) {
            System.out.println("\nPlease type 1 for First Class");
            System.out.println("Please type 2 for Economy");
            System.out.print("Choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                int seat = assignSeat(seats, 0, 5);
                if (seat != -1) {
                    displayBoardingPass("First Class", seat + 1);
                } else {
                    if (isSectionFull(seats, 5, 10)) {
                        System.out.println("Plane is full. Next flight leaves in 3 hours.");
                    } else {
                        System.out.print("First Class full. Is Economy acceptable? (1 for Yes, 2 for No): ");
                        if (input.nextInt() == 1) {
                            seat = assignSeat(seats, 5, 10);
                            displayBoardingPass("Economy", seat + 1);
                        } else {
                            System.out.println("Next flight leaves in 3 hours.");
                        }
                    }
                }
            } else if (choice == 2) {
                int seat = assignSeat(seats, 5, 10);
                if (seat != -1) {
                    displayBoardingPass("Economy", seat + 1);
                } else {
                    if (isSectionFull(seats, 0, 5)) {
                        System.out.println("Plane is full. Next flight leaves in 3 hours.");
                    } else {
                        System.out.print("Economy full. Is First Class acceptable? (1 for Yes, 2 for No): ");
                        if (input.nextInt() == 1) {
                            seat = assignSeat(seats, 0, 5);
                            displayBoardingPass("First Class", seat + 1);
                        } else {
                            System.out.println("Next flight leaves in 3 hours.");
                        }
                    }
                }
            }
        }
    }

    private static int assignSeat(boolean[] seats, int start, int end) {
        for (int i = start; i < end; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return i;
            }
        }
        return -1;
    }

    private static boolean isSectionFull(boolean[] seats, int start, int end) {
        for (int i = start; i < end; i++) {
            if (!seats[i]) return false;
        }
        return true;
    }

    private static void displayBoardingPass(String section, int seatNumber) {
        System.out.println("\n--------------------------------");
        System.out.println("BOARDING PASS");
        System.out.printf("Section: %s%nSeat Number: %d%n", section, seatNumber);
        System.out.println("--------------------------------\n");
    }
}