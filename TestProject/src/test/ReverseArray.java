package test;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

public class ReverseArray {

  public static void main(String[] args) throws IllegalAccessException {
    int[] array = {1, 2, 3, 4, 5, 6, 7};
    ArrayUtils.reverse(array);
    System.out.println(Arrays.toString(array));
    System.out.println("Пробую");
  }
}
