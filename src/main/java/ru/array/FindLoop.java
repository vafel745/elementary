package ru.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                return i;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                return i;
            }
        }
        return rst;
    }

}
