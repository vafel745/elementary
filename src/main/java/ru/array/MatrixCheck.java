package ru.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean res = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i].length == 'X') {
                    row++;
                    res = true;
                }
            }
        }
        return res;
    }
}
