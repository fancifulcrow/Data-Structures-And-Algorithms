package SearchAlgorithms;

public class LinearSearchAlgorithm {
    public static int linearSearch(int[] arr, int x){
        int n = arr.length;
        
        // iterate over each element in the array
        for (int i = 0; i < n; i++) {
            // if the current element is equal to x, return its index
            if (arr[i] == x) {
                return i;
            }
        }
        
        // if the element is not found, return -1
        return -1;
    }
}

/*
 * Linear search is a simple searching algorithm that is used to find an element in a list or an array 
 * by sequentially checking each element in the list until a match is found or the end of the list is reached. 
 */