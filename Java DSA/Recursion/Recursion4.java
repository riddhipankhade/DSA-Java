package Recursion;
//print x^n (stack height = n)

public class Recursion4 {
  public static int calcPower(int x, int n){
    //two base cases
    //if x = 0 
    if(x==0){
      return 0;
    }
    //if n = 0
    if(n==0){
      return 1;
    }

    int xPowernm1 = calcPower(x, n-1);
    int xPown = x * xPowernm1;
    return xPown;
  }
  public static void main(String[] args){
    int x = 2, n =5;
    int ans = calcPower(x, n);
    System.out.println(ans);
  }
}
