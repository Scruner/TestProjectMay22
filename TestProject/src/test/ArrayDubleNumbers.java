package test;

public class ArrayDubleNumbers {

  public static void main(String[] args){
    int[] array = {1, 8, 3, 6, 5, 10, 31, 24, 10, 13, 2, 4};
    int k = 0; // количество чётных чисел

    for (int count : array) {
      if (count % 2 == 0) {
        k++;
      }
    }
    System.out.println(k);
  }
}
