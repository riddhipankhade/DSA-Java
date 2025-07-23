package Math;

import java.util.Scanner;

public class PrintAllDivisor {
    public static int sumOfDivisior(int n){
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i * (n/i);
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt();

        int total = sumOfDivisior(n);
        System.out.print("Sum is: "+ total);
    }
}
