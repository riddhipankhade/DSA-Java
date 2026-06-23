package Array;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter arr elements(10):");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Largest Element:" + secondLargest(arr));
    }

    public static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                secLargest = largest;
                largest = num;
            }else if( num < largest && num > secLargest){
                secLargest = num;
            }
        }
        return (secLargest == Integer.MIN_VALUE)? -1: secLargest;
    }
}
