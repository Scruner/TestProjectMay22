package test;

public class StringBuilderChange {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");

    sb.append(" World").replace(6, 11, "Програмания").reverse();
    //System.out.println(sb);
    String sb1 = "Hello World";
    System.out.println(sb1.length());
    System.out.println(sb1.indexOf("d"));
  }
}
