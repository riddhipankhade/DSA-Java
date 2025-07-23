package Recursion;
//find the 1st and last occurance of an element in string ***

public class Recursion8 {
  public static int first = -1;
  public static int last = -1;

  public static void findOccurrence(String str, int idx, char element) {
    if (idx == str.length()) {
      System.out.println("First occurrence: " + first);
      System.out.println("Last occurrence: " + last);
      return;
    }

    char currentChar = str.charAt(idx);
    if (currentChar == element) {
      if (first == -1) {
        first = idx;
      } else {
        last = idx;
      }
    }

    findOccurrence(str, idx + 1, element);
  }

  public static void main(String[] args) {
    String str = "abcaadca";
    char target = 'a';

    findOccurrence(str, 0, target);
  }
}