//inverted half no pyramid

//12345 r=1 c=n
//1234
//123
//12
//1

import java.util.*;


public class Pattern7 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows:");
    int c = sc.nextInt();

    for(int i = c; i > 0; i--){
      for(int j = 1 ; j <= i ; j++){
        System.out.print(j);
      }
      System.out.println();
    }

    sc.close();
  }
  
}
