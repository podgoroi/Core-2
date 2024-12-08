package task.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Generics {

  public static <T> T getFirstElement(List<T> list) {
    if (list.isEmpty() || list.getFirst() == null) {
      throw new IllegalArgumentException("Список пуст или равен null");
    }
    return list.getFirst();
  }

  public static <T> T getLastElement(List<T> list) {
    if (list.isEmpty() || list.getFirst() == null) {
      throw new IllegalArgumentException("Список пуст или равен null");
    }
    return list.getLast();
  }

  public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
    List <T> list3= new ArrayList<>();
    if (list1.getFirst() == null) {
      throw new IllegalArgumentException("Список пуст или равен null");
    }
    if (list2.getFirst() == null) {
      throw new IllegalArgumentException("Список пуст или равен null");
    }
    list3.addAll(list1);
    list3.addAll(list2);
    return list3;
  }

  public static <T> List<T> getUniqueElements(List<T> list) {
    HashSet <T> seti = new HashSet<>();
    List <T> list2 = new ArrayList<>();
    if (list.isEmpty() || list.getFirst() == null) {
      throw new IllegalArgumentException("Список пуст или равен null");
    }
    for (T t : list) {
      seti.add(t);
    }
    list2.addAll(seti);
    return list2;
  }
}
