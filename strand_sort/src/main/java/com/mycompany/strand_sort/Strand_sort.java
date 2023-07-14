package com.mycompany.strand_sort;
import java.util.ArrayList;
import java.util.List;
public class Strand_sort {
    public static List<Integer> strandSort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }
        List<Integer> result = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>(arr);
        
        while (!sublist.isEmpty()) {
            List<Integer> sorted = new ArrayList<>();
            sorted.add(sublist.remove(0));

            int i = 0;
            while (i < sublist.size()) {
                if (sublist.get(i) > sorted.get(sorted.size() - 1)) {
                    sorted.add(sublist.remove(i));
                } else {
                    i++;
                }
            }
            result = merge(result, sorted);
        }
        return result;
    }
    private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }
        return merged;
    }
    public static void printList(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(8);
        arr.add(4);
        arr.add(1);
        arr.add(56);
        arr.add(3);
        arr.add(-44);
        arr.add(23);
        arr.add(-6);
        arr.add(28);
        arr.add(0);

        System.out.println("Original list:");
        printList(arr);

        List<Integer> sortedList = strandSort(arr);

        System.out.println("Sorted list by Strand Sort :");
        printList(sortedList);
    }
}
