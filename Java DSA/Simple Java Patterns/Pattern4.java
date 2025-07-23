//descednign pyramid 
import java.util.*;

public class Pattern4 { 
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      // **** i = c
      // ***  
      // **   
      // *    i = 0

      System.out.println("Enter the number of rows:");
      int c = sc.nextInt();

      for(int i = c; i > 0; i--){
        for(int j = 0; j < i; j++){
          System.out.print("*");
        }
        System.out.println();
      }
      sc.close();
    }
}
