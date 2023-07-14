package com.mycompany.bucket_sort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Bucket_sort {
    public void bucketSort(double[] arr, int n) {
        if (n <= 0)
            return;
        ArrayList<Double>[] bucket = new ArrayList[n];
        for (int i = 0; i < n; i++)
            bucket[i] = new ArrayList();
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * n;
            bucket[bucketIndex].add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            Collections.sort((bucket[i]));
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0, size = bucket[i].size(); j < size; j++) {
                arr[index++] = bucket[i].get(j);
            }
        }
    }
    public static void main(String[] args) {
        Bucket_sort b = new Bucket_sort();
        double[] arr = { 0.21,  0.11, 0.03,0.12, 0.47,0.22,0.19 };
        b.bucketSort(arr, 7);
        System.out.print("Sorted Array by Bucket Sort : "+ Arrays.toString(arr));

    }
}
