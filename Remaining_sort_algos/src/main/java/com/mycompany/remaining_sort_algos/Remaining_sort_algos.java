package com.mycompany.remaining_sort_algos;

import java.util.Arrays;

public class Remaining_sort_algos {
    void countingSort(int arr1[], int size) {
        int[] output = new int[size + 1];
        int max = arr1[0];
        for (int i = 1; i < size; i++) {
            if (arr1[i] > max)
               max = arr1[i];
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < max; ++i) {
                count[i] = 0;
        }
        for (int i = 0; i < size; i++) {
            count[arr1[i]]++;
        }
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        for (int i = size - 1; i >= 0; i--) {
            output[count[arr1[i]] - 1] = arr1[i];
            count[arr1[i]]--;
        }
        for (int i = 0; i < size; i++) {
            arr1[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] data = { 33,20,100,40,98,54,15 };
        int size = data.length;
        Remaining_sort_algos cs = new Remaining_sort_algos();
        cs.countingSort(data, size);
        System.out.println("Sorted Array by Counting Sort: ");
        System.out.println(Arrays.toString(data));
        /*int[] array = {13,2,66,88,33,44,99,100,1,3,6};
        boolean sort = false;
        int temp ;
        while(!sort) {
            sort = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sort = false;
                }
            }
        }
        System.out.println("Sorted Array by Bubble Sort Algorithm: "+Arrays.toString(array)); */
        
        
    }
   
}
