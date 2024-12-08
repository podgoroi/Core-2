package task.collection;

import java.sql.SQLOutput;
import java.util.*;

public class Collection {

  public int findMaxElement(List<Integer> list) {
    int valueMax = 0;
    for (int i = 0; i < 1; i++) {
      valueMax = list.get(i);
      for (int j = 1; j < list.size(); j++) {
        if (list.get(j) > valueMax) {
          valueMax = list.get(j);
        }
      }
    }
    return valueMax;
  }

  public List<Integer> removeDuplicates(List<Integer> list) {
    List <Integer> list2 = new ArrayList<>();
    for (int a : list){
      if (!list2.contains(a)) {
        list2.add(a);
      }
    }
    return list2;

  }

  public List<Integer> sortDescending(List<Integer> list) {
    boolean b = false;
    int temp;
    while (!b) {
      b = true;
      for (int j = 0; j < list.size() - 1; j++) {
        if (list.get(j) < list.get(j + 1)) {
          temp = list.get(j);
          list.set(j, list.get(j + 1));
          list.set(j + 1, temp);
          b = false;
        }
      }
    }
    return list;
  }

  public boolean containsElement(Set<Integer> set, int element) {
    boolean a = true;
    if (!set.contains(element)) {
      a = false;
    }
    return a;
  }

  public Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {
    Set<Integer> set3 = new HashSet<>(set1);
    set3.retainAll(set2);
    return set3;
  }

  public Set<Integer> removeCommonElements(Set<Integer> set1, Set<Integer> set2) {
    set1.removeAll(set2);
    return set1;
  }

  public boolean containsKey(Map<String, Integer> map, String key) {
    boolean contain = map.containsKey(key);
    return contain;
  }

  public List<Integer> getValuesByKey(Map<String, List<Integer>> map, String key) {
    List <Integer> list = new ArrayList<>();
    list = List.copyOf(map.get(key));
    return list;
  }

  public void removeEntriesByValue(Map<String, Integer> map, int value) {
    for (Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
      Map.Entry<String, Integer> e = iterator.next();
      if (value == e.getValue()) {
        iterator.remove();
      }
    }
  }

  public void addToQueue(Queue<Integer> queue, int element) {
    System.out.println(queue.add(element));
  }

  public Integer pollFromQueue(Queue<Integer> queue) {
    int i = queue.element();
    queue.remove();
    return i;
  }

  public boolean isQueueEmpty(Queue<Integer> queue) {
    return queue.isEmpty();
  }

  public void printOrdersWithMaxAmount(List<Order> orders) {
    int amountMax = 0;
    for (Order o : orders) {
      if (o.totalAmount > amountMax) {
        amountMax = o.totalAmount;
      }
    }
    for (Order o : orders) {
      if (o.totalAmount == amountMax) {
        System.out.println(o);
      }
    }
  }

  public int getTotalAmountOfOrders(List<Order> orders) {
    int total = 0;
    for ( Order o : orders) {
      total += o.totalAmount;
    }
    return total;
  }

  public void printIncompleteTasks(List<Task> tasks) {
    Iterator <Task> iterator = tasks.iterator();
    while (iterator.hasNext()) {
      Task t = iterator.next();
      if (!t.isCompleted) {
        System.out.println(t.title);
      }
    }
  }

  public List<Task> getTasksByTitle(List<Task> tasks, String title) {
    List<Task> tasks1 = new ArrayList<>();
    for (Task o : tasks) {
      if (o.title.equals(title)) {
        tasks1.add(o);
      }
    }
    return tasks1;
  }

  public void printStudents(List<Student> students) {
    Iterator <Student> iterator = students.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  public List<Student> getStudentsOlderThan(List<Student> students, int age) {
    List <Student> list = new ArrayList<>();
    for (Student o : students) {
      if (o.age > age) {
        list.add(o);
      }
    }
    return list;
  }

  public void printProductsWithZeroQuantity(List<Product> products) {
    for (Product o : products) {
      if (o.quantity == 0) {
        System.out.println(o);
      }
    }
  }

  public int getTotalQuantityOfProducts(List<Product> products) {
    int total = 0;
    for (Product o : products) {
      total += o.quantity;
    }
    return total;
  }

  public void printStudentsWithWorstAttendance(List<AttendanceStudent> students) {
    int minAttendance = 100;
    for (AttendanceStudent o : students) {
      if (Integer.parseInt(o.attendance) < minAttendance) {
        minAttendance = Integer.parseInt(o.attendance);
      }
    }
    for (AttendanceStudent o : students) {
      if (Integer.parseInt(o.attendance) == minAttendance) {
        System.out.println(o);
      }
    }
  }

  public double getAverageAttendance(List<AttendanceStudent> students) {
    int totalStudents = 0;
    double totalAttendance = 0;
    for (AttendanceStudent o : students) {
      totalStudents++;
      totalAttendance += Double.parseDouble(o.attendance);
    }
    return totalAttendance / totalStudents;
  }
}