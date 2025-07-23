//Rectangle pattern
import java.util.*;

public class Pattern2 {
  public static void main(String[] args){
  //rows are our outer loop 
  //cols are our inner loops
  //we solve each prblem like a matrix

  // ***** i=1
  // *   * j=1 and j=c
  // *   * same as above
  // ***** i = r

  //here we have 4 rows and 5 cols 
  //each row and column value are have some (r,c) value

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows:");
    int r = sc.nextInt();

    System.out.println("Enter the Number of columns:");
    int c = sc.nextInt();

    for(int i = 0 ; i < r ; i++){
      for(int j = 0 ; j < c; j++){
        //cell -> (i,j)
        //if we look at the pattern like a matrix the first row value is 1(i=1) and all the coulmns, so we want all the rows and columns on i = 1 and j = 1 and we want all the columns in the last which mean the no of rows which is r and c to be printed 
        
        //ou use i == 1, j == 1, etc., but Java arrays and loops are zero-indexed, so:

        //i == 0 → first row

        //j == 0 → first column

        //i == r - 1 → last row

        //j == c - 1 → last column

        if(i == 0 || j == 0 || i == r-1 || j == c-1){
          //any one condition if met executes this block of code
          System.out.print("*");
        }else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
