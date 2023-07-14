package com.mycompany.sorting_algorithm;
import java.util.Arrays;
public class Sorting_Algorithm {
    /*
    public static int partition(int[] arr2, int i, int j)
    {
        int pivot = arr2[(i+j)/2];
        while(i < j)
        {
            while(arr2[i] < pivot)
            {
                i++;
            }
            while(pivot < arr2[j])
            {
                j--;
            }
            if(i <= j)
            {
                int temp = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = temp;
              
                i++;
                j--;
            }
        }      
        return i;
    }
    static void quicksort(int[] num, int i, int j)
    {
        int pivot_index = partition(num, i, j);
        if(i < pivot_index-1)
        {
            quicksort(num, i, pivot_index-1);
        }
        if(pivot_index < j)
        {
            quicksort(num, pivot_index, j);
        }
    }  */
    public static void main(String[] args) {
       /*  System.out.println("---------Quick Sort Algorithm------------");
        int[] num = {27, 23, 11, 7, 9, 17, 6};
        System.out.println("Unsorted Array : "+Arrays.toString(num));
        quicksort(num, 0, num.length-1);
        System.out.println("Sorted Array : "+Arrays.toString(num)); */
        /*
        int[] num = {10,6,15,4,1,5};
        System.out.println("unsorted array "+Arrays.toString(num));
        System.out.println("------------Insertion Sort Algorithm------------");
        for(int i=1; i<num.length; i++)   {  
            int temp = num[i];  
            int j= i-1;  
            while(j>=0 && temp < num[j])   {  
                num[j+1] = num[j];   
                j = j-1;  
            }  
            num[j+1] = temp;  
        }  
        System.out.println("Sorted Array:" + Arrays.toString(num)); */
       System.out.println("------------Selection Sort Algorithm------------");
        double [] arr1 = {2.3, 5.5, 1.1, 0.10, 20.4, 15.5}; 
        int len = arr1.length;
        int M_index;
        for (int i = 0; i<len-1; i++){
            M_index = i;
            for(int j= i+1; j< len; j++){
                if (arr1[j] < arr1[M_index]){
                    M_index = j;
                }
            }
            double temp = arr1[M_index];
            arr1[M_index] = arr1[i];
            arr1[i] = temp;    
        } 
        System.out.println("Sorted Array:" + Arrays.toString(arr1)); 
      
        
    }  
}        
