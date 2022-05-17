package test;

public class DoubleArray {
  public static void main(String[] args) {
    int[][] array = new int[8][8];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = j + 1;
      }
    }
    for (int[] anArray : array) {
      for (int anAnArray : anArray) {
        System.out.println(anAnArray + " ");
      }
      System.out.println();
    }
  }
}
