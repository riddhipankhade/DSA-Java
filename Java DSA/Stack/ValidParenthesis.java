package Stack;

import java.util.Stack;

public class ValidParenthesis {
  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for(char ch : s.toCharArray()){
      //toCharArray converts the input s which is a string into an array of characters so we can iterate through it.
      if(ch == '(' || ch == '{' || ch == '['){
        stack.push(ch);//opeing brackets pushed
      }else {
        if(stack.isEmpty()) return false; 
        //If we find a closing bracket and stack is empty → it's invalid (no opening bracket to match)

        char top = stack.pop();
        //pop the top and check if it matches

         if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Valid only if no unmatched brackets remain
        return stack.isEmpty();
    }
}