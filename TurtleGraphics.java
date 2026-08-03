import java.util.Scanner;

public class TurtleGraphics {
    private static final int[][] floor = new int[20][20];
    private static int row = 0, col = 0;
    private static boolean penDown = false;
    private static int direction = 0; // 0: Right, 1: Down, 2: Left, 3: Up

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter commands (9 to end):");

        int command = input.nextInt();
        while (command != 9) {
            switch (command) {
                case 1 -> penDown = false;
                case 2 -> {
                    penDown = true;
                    floor[row][col] = 1;
                }
                case 3 -> direction = (direction + 1) % 4; // Turn Right
                case 4 -> direction = (direction + 3) % 4; // Turn Left
                case 5 -> {
                    int spaces = input.nextInt();
                    move(spaces);
                }
                case 6 -> displayFloor();
            }
            command = input.nextInt();
        }
        input.close();
    }

    private static void move(int spaces) {
        for (int i = 0; i < spaces; i++) {
            switch (direction) {
                case 0 -> { if (col < 19) col++; }
                case 1 -> { if (row < 19) row++; }
                case 2 -> { if (col > 0) col--; }
                case 3 -> { if (row > 0) row--; }
            }
            if (penDown) {
                floor[row][col] = 1;
            }
        }
    }

    private static void displayFloor() {
        for (int r = 0; r < 20; r++) {
            for (int c = 0; c < 20; c++) {
                System.out.print(floor[r][c] == 1 ? "*" : " ");
            }
            System.out.println();
        }
    }
}