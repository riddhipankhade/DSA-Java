import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key){
        int front = 0;
        int rear = arr.length - 1;
        Arrays.sort(arr);
        
        while(front <= rear){
            int mid = front + (rear - front)/2;

            if(arr[mid] == key){
                return mid;
            }else if(key > arr[mid]){
                front = mid + 1;
            }else {
                rear = mid - 1;
            }
        }
        return -1;
    }
}
