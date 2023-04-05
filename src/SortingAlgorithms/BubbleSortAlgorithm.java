package SortingAlgorithms;

public class BubbleSortAlgorithm {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Iterate over each element in the array
        for (int i = 0; i < n - 1; i++) {

            // Compare adjacent elements and swap them if they are in the wrong order
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

/*
 * Bubble sort is a simple sorting algorithm 
 * that works by repeatedly swapping adjacent elements if they are in the wrong order.
 */