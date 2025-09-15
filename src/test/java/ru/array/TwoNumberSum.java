package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (array[i] + array[j] != target) {
            if ((i == array.length / 2)  || (j == array.length / 2)) {
                return new int[]{};
            } else if (array[i] + array[j] < target) {
                i++;
            } else if (array[i] + array[j] > target) {
                j--;
            }
        }
        return new int[]{i, j};
    }
}
