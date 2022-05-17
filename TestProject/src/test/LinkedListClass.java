package test;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {
  public static void main(String[] args) {
    LinkedList<Person> linkedList = new LinkedList<>();
    linkedList.add(new Person("Anton", 78));
    linkedList.add(new Person("Igor", 34));
    linkedList.add(new Person("Stepan", 16));

    ListIterator<Person> personListIterator =
            linkedList.listIterator(linkedList.size());
    while (personListIterator.hasNext()) {
      System.out.println(personListIterator.next());
    }
    System.out.println("***********************");
    while (personListIterator.hasPrevious()) {
      System.out.println(personListIterator.previous());
    }
  }

  public static record Person(String name, int age) {}
}
