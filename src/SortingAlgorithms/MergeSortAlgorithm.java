package SortingAlgorithms;

public class MergeSortAlgorithm {
    
    // Method to perform Merge Sort
    public static void mergeSort(int[] arr){
        // If the array is empty or has only one element, it is already sorted
        if (arr.length < 2) {
            return;
        }
        
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }
    
    // Recursive method to divide array into smaller subarrays and merge them
    private static void mergeSort(int[] arr, int[] temp, int low, int high) {
        if (low >= high) {
            return; // when array has one element or is empty
        }
        
        int mid = low + (high - low) / 2; // Find index of the midpoint
        
        // Recursively sort left and right subarrays
        mergeSort(arr, temp, low, mid);
        mergeSort(arr, temp, mid + 1, high);
        
        // Merge the two sorted subarrays
        merge(arr, temp, low, mid, high);
    }
    
    // Merge two sorted subarrays
    private static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        int i = low, j = mid + 1, k = low; // Initialize variables
        
        // Merge the two subarrays into temp array
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        
        // Copy remaining elements from left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        // Copy remaining elements from right subarray
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        
        // Copy merged elements from temp array to original array
        for (int m = low; m <= high; m++) {
            arr[m] = temp[m];
        }
    }
}

/*
 * Merge sort is a sorting algorithm 
 * that divides an array into two halves, sorts each half recursively, 
 * and then merges the two halves back together. 
 * It is a divide-and-conquer algorithm.
 */