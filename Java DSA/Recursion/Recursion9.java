package Recursion;
//check if array is sorted(strictly increasing)

public class Recursion9 {

  public static boolean isSorted(int[] arr, int idx) {
    // Base case: if we reach the last element, it's sorted
    if (idx == arr.length - 1) {
      return true;
    }

    // If current element is not less than next, it's not strictly increasing
    if (arr[idx] >= arr[idx + 1]) {
      return false;
    }

    // Recursive check for the rest of the array
    return isSorted(arr, idx + 1);
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {1, 2, 2, 4, 5};

    System.out.println("arr1 is sorted: " + isSorted(arr1, 0)); // true
    System.out.println("arr2 is sorted: " + isSorted(arr2, 0)); // false
  }
}
