package SortingAlgorithms;

import java.util.Random;

public class Sorter {

    public static void addItems(int[] arr, int minValue, int maxValue){
        int n = arr.length;
        Random random = new Random();

        for (int i = 0; i < n; i++){
            arr[i] = (minValue + random.nextInt(maxValue - minValue));
        }
    }

    public static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
}
