package ru.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int diagonalX = Math.abs(x2 - x1);
        int diagonalY = Math.abs(y2 - y1);

        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (diagonalX == diagonalY) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}