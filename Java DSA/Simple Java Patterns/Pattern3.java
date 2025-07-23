//half pyramid pattern
import java.util.*;

public class Pattern3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // *    
    // **   
    // ***  
    // ****
    
    //this is related to the number of rows 
    // rows == no of columns 
    //so if row =1 cols are also 1 and so on 

    System.out.println("Enter the number of rows:");
    int r = sc.nextInt();

    for(int i = 0 ; i <=r; i++){
      for(int j = 0; j <i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}
