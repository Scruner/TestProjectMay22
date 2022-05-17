package test;

public class LoopFor {
  public static void main(String[] args) {
    int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7};
    int count = 0;
    for (int i = 0; i < numbers.length; i++) {
      count++;
      if (count % 2 == 0) {
        System.out.println(numbers[i]);
      }
    }
    System.out.println(count);
  }
}
