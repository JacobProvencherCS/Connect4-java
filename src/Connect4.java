


public class Connect4 {

    static final int ROWS = 6;
    static final int COLS = 7;

    public static void main(String[] args) {
        char[][] board = new char[ROWS][COLS];

        // Initialize empty board
        for (int r = 0; r < ROWS; r++)
            for (int c = 0; c < COLS; c++)
                board[r][c] = '.';

        // Example moves
        board[5][3] = 'X';
        board[5][4] = 'O';
        board[4][3] = 'X';

        printBoard(board);
    }

    static void printBoard(char[][] board) {
        System.out.println("+---+---+---+---+---+---+---+");
        for (int r = 0; r < ROWS; r++) {
            System.out.print("|");
            for (int c = 0; c < COLS; c++) {
                System.out.print(" " + board[r][c] + " |");
            }
            System.out.println();
            System.out.println("+---+---+---+---+---+---+---+");
        }
        System.out.println("  1   2   3   4   5   6   7  ");
    }
}

