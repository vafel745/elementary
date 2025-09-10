package ru.array;

public class MatrixCheck {

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (monoHorizontal(board, i) || monoVertical(board, j)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

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

    public static boolean monoVertical(char[][] board, int column) {
        boolean res = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                res = false;
                break;
            }
        }
        return res;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
}
