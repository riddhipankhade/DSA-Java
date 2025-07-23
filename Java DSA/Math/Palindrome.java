package Math;

public class Palindrome {
    public boolean isPalindrome(int x){
        int rev = 0;
        String str = String.valueOf(x);
        int n = str.length();
        char[] arr = str.toCharArray();

        for(int i = n - 1; i >= 0; i--){
            char ch = arr[i];
            int integer = ch - '0';
            rev *= 10 + integer;
        }

        return rev == x;
    }
}
