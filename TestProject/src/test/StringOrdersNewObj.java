package test;

public class StringOrdersNewObj {

  public static void main(String[] args) {
    String str = "Hello";
    str.toUpperCase();
    String str1 = str;
    str1.concat(" World! ");
    String str2 = str1;
    str2.trim();
    String str3 = str2;
    str3.replace("World",
            "Програмания");
    System.out.println(str);
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
  }
}
