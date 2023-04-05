package SortingAlgorithms;

public class InsertionSortAlgorithm {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        // loop through each element in the array
        for (int i = 0; i < n; i++){
            // store the current element in a variable called key
            int key = arr[i];
            int j = i - 1;

            // move elements that are greater than the key to one position ahead of their current position
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }

            // insert the key into its correct position
            arr[j + 1] = key;
        }
    }
}

/*
 * Insertion sort is a simple sorting algorithm 
 * that builds the final sorted array one item at a time. 
 * It is based on the idea that one element from the input elements is consumed in each iteration 
 * to find its correct position in the sorted array.
 */