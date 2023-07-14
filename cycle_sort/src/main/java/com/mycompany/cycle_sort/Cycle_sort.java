package com.mycompany.cycle_sort;

import java.util.Arrays;

public class Cycle_sort {
    public static void cyclesorting (int arr[], int n)
    {
        int count = 0;
        for (int start=0; start<=n-2; start++)
        {
            int item = arr[start];
            int position = start;
            for (int i = start+1; i<n; i++)
                if (arr[i] < item)
                    position++;
            if (position == start)
                continue;
            while (item == arr[position])
                position += 1;
            if (position != start)
            {
                int temp = item;
                item = arr[position];
                arr[position] = temp;
                count++;
            }
            while (position != start)
            {
                position = start;
                for (int i = start+1; i<n; i++)
                    if (arr[i] < item)
                        position += 1;
                while (item == arr[position])
                    position += 1;
                if (item != arr[position])
                {
                    int swap = item;
                    item = arr[position];
                    arr[position] = swap;
                    count++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {11,20,15,18,30,27,40,47,80,60};
        int n = arr.length;
        System.out.println("Before sort : ");
        System.out.println(Arrays.toString(arr));
        cyclesorting(arr, n) ;
        System.out.print('\n');
        System.out.println("After sort by Cycle Sort : ");
        for (int i =0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
}
