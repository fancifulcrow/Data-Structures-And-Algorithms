package SortingAlgorithms;

public class QuickSortAlgorithm {
    public static void quickSort(int[] arr) {
        // If the array is empty or has only one element, it is already sorted
        if (arr.length < 2){
            return;
        }
        
        // Sort the entire array
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high){
        // If the array has more than one element
        while (low < high) {
            // Partition the array and get the pivot element
            int pi = partition(arr, low, high);

            // Recursively sort the left and right subarrays
            if (pi - low < high - pi) {
                quickSort(arr, low, pi - 1);
                low = pi + 1;
            } else {
                quickSort(arr, pi + 1, high);
                high = pi - 1;
            }
        }
    }

    private static int partition(int[] arr, int low, int high){
        // Choose the last element as the pivot.
        int pivot = arr[high];

        // Index of the smaller element
        int i = low - 1;

        // Iterate over the array
        for (int j = low; j <= high - 1; j++){
            // If the current element is smaller than or equal to the pivot
            if (arr[j] < pivot){
                // Increment the index of the smaller element and swap the elements at i and j
                i++;
                swap(arr, i, j);
            }
        }
        
        // Swap the pivot element with the element at i + 1
        swap(arr, i + 1, high);

        // Return the index of the pivot element
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j){
        // Swap the elements at indices i and j
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
 * Quick sort is a comparison-based algorithm 
 * that works by selecting a pivot element from the array 
 * and partitioning the other elements into two sub-arrays, 
 * according to whether they are less than or greater than the pivot. 
 * The sub-arrays are then recursively sorted.
 */