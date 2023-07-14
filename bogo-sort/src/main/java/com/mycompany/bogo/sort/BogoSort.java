package com.mycompany.bogo.sort;
import java.util.Random;
public class BogoSort {
    private static Random random = new Random();
    public static void bogoSort(int[] arr) {
        while (!isSorted(arr)) {
            shuffle(arr);
        }
    }
    private static void shuffle(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = random.nextInt(n);
            swap(arr, i, j);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static boolean isSorted(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10,-1,-10,1,2,-2,-40,9,-4};

        System.out.println("Original array:");
        printArray(arr);

        bogoSort(arr);

        System.out.println("Sorted array by Bogo Sort :");
        printArray(arr);
    }
}
