package Array;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // input
        System.out.print("Enter 5 Numbers:");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        // print
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
