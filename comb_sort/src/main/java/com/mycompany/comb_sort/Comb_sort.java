package com.mycompany.comb_sort;
public class Comb_sort {
    public static void combSort(int[] arr) {
        int n = arr.length;
        int gap = n;
        boolean swapped = true;
 
        while (gap > 1 || swapped) {
            gap = getNextGap(gap);
            swapped = false;
 
            for (int i = 0; i < n - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    // Swap arr[i] and arr[i+gap]
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    swapped = true;
                }
            }
        }
    }
    public static int getNextGap(int gap) {
        // Shrink gap by a factor of 1.3
        gap = (gap * 10) / 13;
 
        if (gap < 1) {
            return 1;
        }
        return gap;
    }
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { -2,-9,-10,-5,-11,-44,-66,-1 };
 
        System.out.println("Original array:");
        printArray(arr);
 
        combSort(arr);
 
        System.out.println("Sorted array by Comb_sort:");
        printArray(arr);
    }
}
