package test;

// В коллекции HashMap есть вспомогательный класс для хранения пары элементов. Выглядит он
// примерно так:

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Entry<KeyType, ValueType> {
  private KeyType key;
  private ValueType value;

  public KeyType getKey() {
    return this.key;
  }

  public ValueType getValue() {
    return this.value;
  }

  // Результат вызова метода entrySet() у объекта типа HashMap<ТКлюч,
  // ТЗначение> будет иметь тип Set<Entry<ТКлюч, ТЗначение>>:

  // Set<Entry<Ключ, Значение>> имя = map.entrySet();

  // Tут мы видим сложный тип Set с параметром-значением, а в качестве параметра-значение
  // выступает еще один сложный тип (Entry), так еще и с двумя параметрами.
  // Новичку очень легко в этом запутаться. Хотя, если разберетесь, сможете писать код вида:
  public static void main(String[] args) {

    HashMap<String, Integer> map = new HashMap<String, Integer>();
    map.put("Серега", 21);
    map.put("Николай", 22);
    map.put("Иван Петрович", 48);
    map.put("Анюта", null);
    Set<Map.Entry<String, Integer>> entries = map.entrySet();
    for (Map.Entry<String, Integer> pair : entries) {
      String key = pair.getKey();
      Integer value = pair.getValue();
      System.out.println(key + " --> " + value);
    }

    // Хотя этот код можно и немножко упростить: Во-первых, можно не создавать отдельную
    // переменную для entries, а сразу вызвать метод entrySet() внутри цикла for:
    for (Map.Entry<String, Integer> pair : map.entrySet()) {
      String key = pair.getKey();
      Integer value = pair.getValue();
      System.out.println(key + " --> " + value);
    }

    // Во-вторых, можно воспользоваться недавно появившимся оператором var
    // для автоматического выведения типа пары элементов:
    for (var pair : map.entrySet()) {
      String key = pair.getKey();
      Integer value = pair.getValue();
      System.out.println(key + " --> " + value);
    }
  }
}
