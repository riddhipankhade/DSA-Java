package Math;
import java.util.Scanner;

public class AmstrongNo {
    public static boolean isAmstrong(int n){
      int original = n;
      int sum = 0;

      //convert to string to find no of digits 
      int digits = String.valueOf(n).length();

      while(n != 0){
        int digit = n % 10;
        sum += Math.pow(digit,digits);
        n /= 10;
      }
      return sum == original;
    }
    
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);

      System.out.println("Enter number");
      int n = s.nextInt();

      if(isAmstrong(n)){
      System.out.println("Number is a Amstrong no.");
      }else{
        System.out.println("Number is not an Amstrong no.");
      }
      s.close();
    }
    
}
