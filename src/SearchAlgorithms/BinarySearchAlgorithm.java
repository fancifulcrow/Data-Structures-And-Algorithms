package SearchAlgorithms;

public class BinarySearchAlgorithm {
    public static int binarySearch(int[] arr, int x){
        // Set initial values for low and high indices
        int low = 0;
        int high = arr.length - 1;

        // Continue searching while the low index is less than or equal to the high index
        while (low <= high){
            // Calculate the middle index
            int mid = (high + low) / 2;

            // If the target element is found, return the index
            if (arr[mid] == x){
                return mid;
            }
            // If the middle element is less than the target, search in the right half of the array
            else if (arr[mid] < x){
                low = mid + 1;
            }
            // If the middle element is greater than the target, search in the left half of the array
            else{
                high = mid - 1;
            }
        }

        // If the target element is not found in the array, return -1
        return -1;
    }
}
