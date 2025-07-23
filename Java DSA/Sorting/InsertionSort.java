package Sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int current = arr[i];      // store the value to be inserted
            int j = i - 1;

            while(j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j];   // shift elements to the right
                j--;
            }
            arr[j + 1] = current;      // insert current at correct position
        }
    }
}
