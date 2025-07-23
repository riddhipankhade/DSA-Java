//floyds triangle

//1
//2  3
//4  5  6
//7  8  9  10
//11 12 13 14 15

import java.util.*;

public class Pattern8 {
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the number of rows:");
  int r = sc.nextInt();

  int number = 1;

  for(int i = 1; i <= r; i++){
    for(int j = 1; j <= i; j++){
      System.out.print(number);
      number++;
    }
    System.out.println();
  }
  sc.close();
}
}
