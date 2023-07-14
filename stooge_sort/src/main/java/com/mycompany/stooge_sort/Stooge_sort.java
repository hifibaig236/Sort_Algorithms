package com.mycompany.stooge_sort;
public class Stooge_sort {
    public static void stoogeSort(int[] arr) {
        stoogeSortRecursive(arr, 0, arr.length - 1);
    }
    private static void stoogeSortRecursive(int[] arr, int start, int end) {
        if (arr[start] > arr[end]) {
            swap(arr, start, end);
        }
        if (end - start + 1 >= 3) {
            int third = (end - start + 1) / 3;

            stoogeSortRecursive(arr, start, end - third);
            stoogeSortRecursive(arr, start + third, end);
            stoogeSortRecursive(arr, start, end - third);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};

        System.out.println("Original array:");
        printArray(arr);

        stoogeSort(arr);

        System.out.println("Sorted array by Stooge Sort :");
        printArray(arr);
    }
}
