package com.company;

import java.util.Arrays;

public class Main {
    static int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
    static int[] two = new int[2];
    static int[] sortedArr = new int[arr.length];

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArr(arr)));
    }

    public static int[] sortArr(int[] arr) {
        int counter = 0;
        while (counter < arr.length) {
            for (int i = 0; i < arr.length; i++) {
                two[0] = arr[i];
                if (two[0] > two[1]) {
                    sortedArr[i] = two[0];
                    two[1] = two[0];
                    counter++;
                } else if (two[0] < two[1]) {
                    sortedArr[i - 1] = two[0];
                    sortedArr[i] = two[1];
                    counter = 0;
                }
            }
            arr = sortedArr;
            two[0] = 0;
            two[1] = 0;
        }
        return sortedArr;
    }
}
