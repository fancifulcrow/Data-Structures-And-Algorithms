package SortingAlgorithms;

public class SelectionSortAlgorithm {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Loop through the array
        for (int i = 0; i < n; i++){
            int minIndex = i; // Assume the minimum value is at the current index

            // Find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j; // Update the minimum index
                }
            }

            // Swap the minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

/*
 * Selection sort is a simple sorting algorithm 
 * that works by repeatedly finding the minimum element from the unsorted part of the array 
 * and placing it at the beginning of the sorted part of the array.
 */