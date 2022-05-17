package test;

public class CallingNoStaticMethod {
  public static void main(String[] args) {
    System.out.println(getName());
  }

  public static String getName() {
    String s = "Java Learning";
    return s.replace('a', 'e');
  }
}
