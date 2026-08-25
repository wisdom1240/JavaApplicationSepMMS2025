public class CrosswordGenerator {
    private static final int SIZE = 10;
    private static char[][] grid = new char[SIZE][SIZE];

    public static void main(String[] args) {
        // Initialize grid
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) grid[i][j] = '#';
        }

        placeWordHorizontal("JAVA", 2, 2);
        placeWordVertical("ARRAY", 1, 4);

        printGrid();
    }

    private static void placeWordHorizontal(String word, int row, int col) {
        for (int i = 0; i < word.length(); i++) grid[row][col + i] = word.charAt(i);
    }

    private static void placeWordVertical(String word, int row, int col) {
        for (int i = 0; i < word.length(); i++) grid[row + i][col] = word.charAt(i);
    }

    private static void printGrid() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }
}