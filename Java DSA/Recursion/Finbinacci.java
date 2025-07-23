package Recursion;
public class Finbinacci {
  public static void printFib(int a, int b, int n){

    //base case
    if(n==0){
      return;
    }

    //a and b are last and second last term resp
    //third term
    int c = a+b;
    System.out.println(c);

    //now to print the next term then b becomes a and c becomes b

    //recursion
    printFib(b,c,n-1);//no of term since we printed one more no of the series it will start decreasing by 1

  }

  public static void main(String args[]){
    int a = 0, b = 1;
    System.out.println(a);
    System.out.println(b);
    int n = 7;
    printFib(a,b,n-2); //n-2 since we printed the first two no of the series that is a and b
  }
}
