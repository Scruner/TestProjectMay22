package test;

import java.util.HashSet;
import java.util.Set;

public class SetClass {
  public static void main(String[] args) {
    Set<Ball> balls = new HashSet<>();
    balls.add(new Ball("red"));
    balls.add(new Ball("red"));
    balls.add(new Ball("red"));
    balls.add(new Ball("yellow"));
    balls.add(new Ball("orange"));

    balls.remove(new Ball("red"));

    System.out.println(balls.size());
    balls.forEach(System.out::println);
  }

  record Ball(String color) {}
}
