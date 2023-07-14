package com.mycompany.radix_sort;
import java.util.Arrays;
public class Radix_sort {
    void countSort(int array[], int size, int place) {
    int[] output = new int[size + 1];
    int max = array[0];
    for (int i = 1; i < size; i++) {
      if (array[i] > max)
        max = array[i];
    }
    int[] count = new int[max + 1];
    for (int i = 0; i < max; ++i)
      count[i] = 0;
    for (int i = 0; i < size; i++)
      count[(array[i] / place) % 10]++;
    for (int i = 1; i < 10; i++)
      count[i] += count[i - 1];
    for (int i = size - 1; i >= 0; i--) {
      output[count[(array[i] / place) % 10] - 1] = array[i];
      count[(array[i] / place) % 10]--;
    }
        System.arraycopy(output, 0, array, 0, size);
  }
  int getMax(int array[], int n) {
    int max = array[0];
    for (int i = 1; i < n; i++)
      if (array[i] > max)
        max = array[i];
    return max;
  }
  void radixSort(int array[], int size) {
    int max = getMax(array, size);
    for (int place = 1; max / place > 0; place *= 10)
      countSort(array, size, place);
  }
    public static void main(String[] args) {
        int[] data = { 90,67,87,44,33,22,11,9,7,8,2,1,4,45 };
        int size = data.length;
        System.out.println("Before Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
        Radix_sort rs = new Radix_sort();
        
        rs.radixSort(data, size);
        System.out.println(" After Sorting Array By Radix_Sort: ");
        System.out.println(Arrays.toString(data));
    }
}
