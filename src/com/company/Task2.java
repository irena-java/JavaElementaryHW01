package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = createRandomArray();
        System.out.printf("Ср.значение по массиву %s равно %.2f.", Arrays.toString(arr), calculateAverage(arr));
    }

    private static double calculateAverage(int[] arr) {
        double averageArray = 0.0;
        for (int value : arr) {
            averageArray += value;
        }
        return averageArray / arr.length;
    }

    private static int[] createRandomArray() {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11) + 10;
        }
        return arr;
    }
}
