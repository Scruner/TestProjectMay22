package test;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
  public static void main(String[] args) {
    Map<Integer, Person> map = new HashMap<>();
    map.put(1, new Person("Miriam"));
    map.put(2, new Person("John"));
    map.put(3, new Person("Nick"));

    System.out.println(map);
    System.out.println(map.size());
    System.out.println(map.get(1));
    System.out.println("******");
    System.out.println(map.containsKey(4));
    System.out.println("******");
    System.out.println(map.entrySet());
    System.out.println("******");
    System.out.println(map.keySet());
    System.out.println("******");
    map.entrySet().forEach(System.out::println);
    map.forEach((key, value) -> System.out.println(key + " " + value));
    System.out.println("******");
    System.out.println(map.getOrDefault(2, new Person("kraken")));
    System.out.println("******");
    System.out.println(map.values());

  }

  record Person(String name) {}
}
