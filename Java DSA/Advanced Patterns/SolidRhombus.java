import java.util.*;

public class SolidRhombus {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter no of rows:");
    int r = sc.nextInt();

    for(int i = r; i >= 1 ; i--){
      for(int j =1; j <=i ; j++){
        System.out.print(" ");
      }

      for(int j = 1 ; j <= r; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    sc.close();
  }
}
