package Array;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter arr elements(10):");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The smallest element is:" + smallestElement(arr));
    }

    public static int smallestElement(int[] arr){
        int smallest = arr[0];
        for(int num : arr){
            if(num < smallest){
                smallest = num;
            }
        }
        return smallest;
    }
}
