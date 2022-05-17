package test;

public class ReverseString {
  public static void main(String[] args) {
    String numbers = "1234567";
    // variant 1
    for (int i = numbers.length(); i > 0; i--) {
      System.out.print(i);
    }
    System.out.println();
    // variant 2
    StringBuilder sb = new StringBuilder(numbers);
    sb.reverse();
    System.out.println(sb);
  }

}
