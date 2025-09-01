package ru.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] arr = new int[bound];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int num : array) {
            System.out.println(num);
        }
    }
}