package com.mycompany.pigeonhole_sort;
import java.util.Arrays;
public class Pigeonhole_sort {  
    public static void pigeonholeSort(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int range = max - min + 1;

        int[] pigeonholes = new int[range];

        for (int num : arr) {
            pigeonholes[num - min]++;
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (pigeonholes[i] > 0) {
                arr[index++] = i + min;
                pigeonholes[i]--;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 56, 3, 44, 23, 6, 28, 0};

        System.out.println("Original array:");
        printArray(arr);

        pigeonholeSort(arr);

        System.out.println("Sorted array by Pigeonhole Sort :");
        printArray(arr);
    }
}
