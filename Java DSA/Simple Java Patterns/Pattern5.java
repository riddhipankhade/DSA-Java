//inverted hald pyramid 

//    *  3 space + 1 star = 4
//   **  2 space + 2 star = 4
//  ***  1 space + 3 star = 4
// ****  0 space + 4 star = 4
// 4 = no of rows

import java.util.*;

public class Pattern5 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows:");
    int r = sc.nextInt();

    for(int i = 1; i <= r; i++){
      for(int j = 1; j <= r-i; j++){
        System.out.print(" ");
      }

      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}
