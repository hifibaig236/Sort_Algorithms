package com.mycompany.cocktail_sort;
public class Cocktail_sort {
    public static void cocktailSort(int[] arr) {
        boolean swapped;
        int start = 0;
        int end = arr.length - 1;
        do {
            swapped = false;

            // Forward pass
            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            end--;
            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            start++;
        } while (swapped);
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
        int[] arr = {100,20,11,9,5,-2,19,-12};

        System.out.println("Original array:");
        printArray(arr);

        cocktailSort(arr);

        System.out.println("Sorted array by cocktail sort :");
        printArray(arr);
    }
}
