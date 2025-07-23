package Stack;

import java.util.ArrayList;

public class stack {
  ArrayList<Integer> stack;

  public stack(){
    stack = new ArrayList<>();
  }

  //push operation
  public void push(int data){
    stack.add(data);
    System.out.println(data + " pushed to the stack");
  }

  //pop operation
  public int pop(){
    if(isEmpty()){
      System.out.println("Stack Underflow! Nothing to pop.");
      return -1;
    }
    return stack.remove(stack.size()-1);
  }

  //peek operation
  public int peek(){
    if(isEmpty()){
      System.out.println("Stack is empty. Nothing to peek.");
      return -1;
    }

    return stack.get(stack.size()-1);
  }

  //isempty 
  public boolean isEmpty(){
    return stack.isEmpty();
  }

  //size of stack
  public int size(){
    return stack.size();
  }

  //print stack

  public void printstack(){
    System.out.println("Stack(top to bottom): ");
    for(int i = stack.size()-1; i >=0; i--){
      System.out.print(stack.get(i)+ " ");
    }
    System.out.println();
  }

}
