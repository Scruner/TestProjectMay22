package test;

import java.util.Arrays;

public class TestArray {
  public static void main(String[] args) {
    String[] colors = new String[5];
    colors[0] = "purple";
    colors[1] = "red";

    Arrays.stream(colors).forEach(System.out::println);
  }
}
