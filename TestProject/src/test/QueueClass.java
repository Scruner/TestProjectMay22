package test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
  public static void main(String[] args) {
    Queue<Person> supermarket = new LinkedList<>();
    supermarket.add(new Person("Anna", 23));
    supermarket.add(new Person("Alex", 27));
    supermarket.add(new Person("Andrey", 45));

    System.out.println(supermarket.size());
    System.out.println(supermarket.poll());
    System.out.println(supermarket.size());

  }

  static record Person(String name, int age) {}
}
