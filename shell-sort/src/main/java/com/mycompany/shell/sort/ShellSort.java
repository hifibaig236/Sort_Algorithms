package com.mycompany.shell.sort;

import java.util.Arrays;

public class ShellSort {
    void shell_sort(int array[], int n) {
  for (int interval = n / 2; interval > 0; interval /= 2) {
    for (int i = interval; i < n; i += 1) {
    int temp = array[i];
    int j;
    for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
      array[j] = array[j - interval];
    }
    array[j] = temp;
    }
  }
  }
    public static void main(String[] args) {
        int[] data = { 33,22,88,55,44,99,77,66,11,10};
        int size = data.length;
        System.out.println("Before Sorted Array : ");
        System.out.println(Arrays.toString(data));
        ShellSort ss = new ShellSort();
        ss.shell_sort(data, size);
        System.out.println("\n");
        System.out.println("After Sorting Array by Shell Sort : ");
        System.out.println(Arrays.toString(data));
    }
}
