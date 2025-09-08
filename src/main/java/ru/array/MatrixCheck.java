package ru.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean res = true;
        for (int i = 0; i < board.length; i++) {
                if (board[row][i] != 'X') {
                    res = false;
                    break;
                }
        }
        return res;
    }
}
