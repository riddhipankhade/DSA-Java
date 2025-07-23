package Stack;

import java.util.Stack;

public class nextGreaterElement {
  public static int[] nextGreater(int[] arr){
    int n = arr.length;
    int[] result = new int[n];
    Stack<Integer> stack = new Stack<>();

      //we traverse right to left 
      //We go right to left because for each element, we are looking for a greater element to its right.

      //So we must process right elements first to know what is coming after each arr[i].
    for(int i = n - 1; i >= 0; i--){
      while(!stack.isEmpty() && stack.peek() <= arr[i]){
        stack.pop();
      }

      result[i] = stack.isEmpty() ? -1 : stack.peek();

      stack.push(arr[i]);
    }
    return result;
  }


public static void main(String[] args) {
    int[] arr = {4, 5, 2, 25};
    int[] result = nextGreater(arr);

    for (int num : result) {
        System.out.print(num + " ");
    }
}
}

