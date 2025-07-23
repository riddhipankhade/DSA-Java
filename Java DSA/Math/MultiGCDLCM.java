package Math;

public class MultiGCDLCM {

    // Euclidean algorithm for GCD
    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b){
        return (a * b)/gcd(a,b);
    }

    public static int findGCDofArray(int[] arr){
        int result = arr[0];
        for(int i = 1; i < arr.length; i++){
            result = gcd(result, arr[i]);
        }
        return result;
    }
    
    public static int findLCMofArray(int[] arr){
        int result = arr[0];
        for(int i = 1; i < arr.length; i++){
            result = lcm(result, arr[i]);
        }
        return result;
    }
   
    
    public static void main(String[] args) {
        int[] arr = {12, 18, 24};

        System.out.println("GCD of array: " + findGCDofArray(arr));
        System.out.println("LCM of array: " + findLCMofArray(arr));
    }
}

