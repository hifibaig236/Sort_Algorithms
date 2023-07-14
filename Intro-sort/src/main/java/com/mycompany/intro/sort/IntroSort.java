package com.mycompany.intro.sort;
import java.util.Arrays;
public class IntroSort {
    private static final int INSERTION_SORT_THRESHOLD = 16;
    public static void introSort(int[] arr) {
        int depthLimit = (int) (2 * Math.log(arr.length));
        introSortRecursive(arr, 0, arr.length - 1, depthLimit);
    }
    private static void introSortRecursive(int[] arr, int start, int end, int depthLimit) {
        int size = end - start + 1;
        if (size < INSERTION_SORT_THRESHOLD) {
            insertionSort(arr, start, end);
            return;
        }
        if (depthLimit == 0) {
            heapSort(arr, start, end);
            return;
        }
        int pivotIndex = partition(arr, start, end);
        introSortRecursive(arr, start, pivotIndex, depthLimit - 1);
        introSortRecursive(arr, pivotIndex + 1, end, depthLimit - 1);
    }
    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start - 1;
        int j = end + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) {
                return j;
            }
            swap(arr, i, j);
        }
    }
    private static void insertionSort(int[] arr, int start, int end) {
        for (int i = start + 1; i <= end; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= start && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    private static void heapSort(int[] arr, int start, int end) {
        Arrays.sort(arr, start, end + 1);
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
      int[] arr = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};

        System.out.println("Original array:");
        print(arr);

        introSort(arr);

        System.out.println("Sorted array:");
        print(arr);
    }
}
