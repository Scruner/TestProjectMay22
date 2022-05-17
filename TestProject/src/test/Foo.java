package test;

public class Foo {

  void foo() {
    String m = "Hello";
    System.out.println(m);
    bar(m);
    System.out.println(m);
  }

  void bar(String m) {
    m += " World";
  }

  public static void main(String[] args) {
      Foo foo = new Foo();
      foo.foo();
  }
}
