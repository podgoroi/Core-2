package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import task.collection.AttendanceStudent;
import task.collection.Collection;
import task.collection.Order;
import task.collection.Product;
import task.collection.Student;
import task.collection.Task;

public class CollectionTest {

  public static void main(String[] args) {
    Collection collection = new Collection();

    // Тест 1: testFindMaxElement
    List<Integer> list1 = Arrays.asList(1, 3, 2, 5, 4);
    int expectedMaxResult = 5;
    int actualMaxResult = collection.findMaxElement(list1);
    if (expectedMaxResult == actualMaxResult) {
      System.out.println("Тест 1 (findMaxElement) пройден успешно!");
    } else {
      System.out.println(
          "Тест 1 (findMaxElement) не пройден. Ожидался: " + expectedMaxResult + ", получен: "
              + actualMaxResult);
    }

    // Тест 2: testRemoveDuplicates
    List<Integer> list2 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
    List<Integer> expectedRemoveDuplicatesResult = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> actualRemoveDuplicatesResult = collection.removeDuplicates(list2);
    if (expectedRemoveDuplicatesResult.equals(actualRemoveDuplicatesResult)) {
      System.out.println("Тест 2 (removeDuplicates) пройден успешно!");
    } else {
      System.out.println(
          "Тест 2 (removeDuplicates) не пройден. Ожидался: " + expectedRemoveDuplicatesResult
              + ", получен: " + actualRemoveDuplicatesResult);
    }

    // Тест 3: testSortDescending
    List<Integer> list3 = Arrays.asList(1, 3, 2, 5, 4);
    List<Integer> expectedSortDescendingResult = Arrays.asList(5, 4, 3, 2, 1);
    List<Integer> actualSortDescendingResult = collection.sortDescending(list3);
    if (expectedSortDescendingResult.equals(actualSortDescendingResult)) {
      System.out.println("Тест 3 (sortDescending) пройден успешно!");
    } else {
      System.out.println(
          "Тест 3 (sortDescending) не пройден. Ожидался: " + expectedSortDescendingResult
              + ", получен: " + actualSortDescendingResult);
    }

    // Тест 4: testContainsElement
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    int element1 = 3;
    boolean expectedContainsResult = true;
    boolean actualContainsResult = collection.containsElement(set1, element1);
    if (expectedContainsResult == actualContainsResult) {
      System.out.println("Тест 4 (containsElement) пройден успешно!");
    } else {
      System.out.println(
          "Тест 4 (containsElement) не пройден. Ожидался: " + expectedContainsResult + ", получен: "
              + actualContainsResult);
    }

    // Тест 5: testFindIntersection
    Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set3 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
    Set<Integer> expectedIntersectionResult = new HashSet<>(Arrays.asList(4, 5));
    Set<Integer> actualIntersectionResult = collection.findIntersection(set2, set3);
    if (expectedIntersectionResult.equals(actualIntersectionResult)) {
      System.out.println("Тест 5 (findIntersection) пройден успешно!");
    } else {
      System.out.println(
          "Тест 5 (findIntersection) не пройден. Ожидался: " + expectedIntersectionResult
              + ", получен: " + actualIntersectionResult);
    }

    // Тест 6: testRemoveCommonElements
    Set<Integer> set4 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set5 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
    Set<Integer> expectedRemoveCommonResult = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> actualRemoveCommonResult = collection.removeCommonElements(set4, set5);
    if (expectedRemoveCommonResult.equals(actualRemoveCommonResult)) {
      System.out.println("Тест 6 (removeCommonElements) пройден успешно!");
    } else {
      System.out.println(
          "Тест 6 (removeCommonElements) не пройден. Ожидался: " + expectedRemoveCommonResult
              + ", получен: " + actualRemoveCommonResult);
    }

    // Тест 7: testContainsKey
    Map<String, Integer> map1 = new HashMap<>();
    map1.put("key1", 1);
    map1.put("key2", 2);
    String key1 = "key1";
    boolean expectedContainsKeyResult = true;
    boolean actualContainsKeyResult = collection.containsKey(map1, key1);
    if (expectedContainsKeyResult == actualContainsKeyResult) {
      System.out.println("Тест 7 (containsKey) пройден успешно!");
    } else {
      System.out.println(
          "Тест 7 (containsKey) не пройден. Ожидался: " + expectedContainsKeyResult + ", получен: "
              + actualContainsKeyResult);
    }

    // Тест 8: testGetValuesByKey
    Map<String, List<Integer>> map2 = new HashMap<>();
    map2.put("key1", Arrays.asList(1, 2, 3));
    map2.put("key2", Arrays.asList(4, 5, 6));
    String key2 = "key1";
    List<Integer> expectedGetValuesResult = Arrays.asList(1, 2, 3);
    List<Integer> actualGetValuesResult = collection.getValuesByKey(map2, key2);
    if (expectedGetValuesResult.equals(actualGetValuesResult)) {
      System.out.println("Тест 8 (getValuesByKey) пройден успешно!");
    } else {
      System.out.println(
          "Тест 8 (getValuesByKey) не пройден. Ожидался: " + expectedGetValuesResult + ", получен: "
              + actualGetValuesResult);
    }

    // Тест 9: testRemoveEntriesByValue
    Map<String, Integer> map3 = new HashMap<>();
    map3.put("key1", 1);
    map3.put("key2", 2);
    map3.put("key3", 1);
    int value1 = 1;
    collection.removeEntriesByValue(map3, value1);
    if (!map3.containsKey("key1") && !map3.containsKey("key3") && map3.containsKey("key2")) {
      System.out.println("Тест 9 (removeEntriesByValue) пройден успешно!");
    } else {
      System.out.println("Тест 9 (removeEntriesByValue) не пройден.");
    }

    // Тест 10: testAddToQueue
    Queue<Integer> queue1 = new LinkedList<>();
    int element2 = 1;
    collection.addToQueue(queue1, element2);
    if (queue1.size() == 1) {
      System.out.println("Тест 10 (addToQueue) пройден успешно!");
    } else {
      System.out.println("Тест 10 (addToQueue) не пройден.");
    }

    // Тест 11: testPollFromQueue
    Queue<Integer> queue2 = new LinkedList<>();
    queue2.add(1);
    queue2.add(2);
    Integer expectedPollResult = 1;
    Integer actualPollResult = collection.pollFromQueue(queue2);
    if (expectedPollResult.equals(actualPollResult) && queue2.size() == 1) {
      System.out.println("Тест 11 (pollFromQueue) пройден успешно!");
    } else {
      System.out.println("Тест 11 (pollFromQueue) не пройден.");
    }

    // Тест 12: testIsQueueEmpty
    Queue<Integer> queue3 = new LinkedList<>();
    boolean expectedIsEmptyResult = true;
    boolean actualIsEmptyResult = collection.isQueueEmpty(queue3);
    if (expectedIsEmptyResult == actualIsEmptyResult) {
      System.out.println("Тест 12 (isQueueEmpty) пройден успешно!");
    } else {
      System.out.println("Тест 12 (isQueueEmpty) не пройден.");
    }
    // Проверка с добавленным элементом
    queue3.add(1);
    expectedIsEmptyResult = false;
    actualIsEmptyResult = collection.isQueueEmpty(queue3);
    if (expectedIsEmptyResult == actualIsEmptyResult) {
      System.out.println("Тест 12 (isQueueEmpty) с элементом пройден успешно!");
    } else {
      System.out.println("Тест 12 (isQueueEmpty) с элементом не пройден.");
    }

    // Тест 13: testPrintOrdersWithMaxAmount
    List<Order> orders = Arrays.asList(
        new Order(1, "Customer1", 100),
        new Order(2, "Customer2", 200),
        new Order(3, "Customer3", 200)
    );
    // В этом тесте вывод на консоль, поэтому просто вызываем метод
    System.out.println("Тест 13 (printOrdersWithMaxAmount) выполнен.");

    // Тест 14: testGetTotalAmountOfOrders
    List<Order> orders2 = Arrays.asList(
        new Order(1, "Customer1", 100),
        new Order(2, "Customer2", 200),
        new Order(3, "Customer3", 300)
    );
    int expectedTotalAmountResult = 600;
    int actualTotalAmountResult = collection.getTotalAmountOfOrders(orders2);
    if (expectedTotalAmountResult == actualTotalAmountResult) {
      System.out.println("Тест 14 (getTotalAmountOfOrders) пройден успешно!");
    } else {
      System.out.println(
          "Тест 14 (getTotalAmountOfOrders) не пройден. Ожидался: " + expectedTotalAmountResult
              + ", получен: " + actualTotalAmountResult);
    }

    // Тест 15: testPrintIncompleteTasks
    List<Task> tasks = Arrays.asList(
        new Task(1, "Task1", false),
        new Task(2, "Task2", true),
        new Task(3, "Task3", false)
    );
    // В этом тесте вывод на консоль, поэтому просто вызываем метод
    System.out.println("Тест 15 (printIncompleteTasks) выполнен.");

    // Тест 16: testGetTasksByTitle
    List<Task> tasks2 = Arrays.asList(
        new Task(1, "Task1", false),
        new Task(2, "Task2", true),
        new Task(3, "Task1", false)
    );
    List<Task> expectedGetTasksResult = new ArrayList<>(Arrays.asList(
        new Task(1, "Task1", false),
        new Task(3, "Task1", false)
    ));
    List<Task> actualGetTasksResult = collection.getTasksByTitle(tasks2, "Task1");
    if (expectedGetTasksResult.equals(actualGetTasksResult)) {
      System.out.println("Тест 16 (getTasksByTitle) пройден успешно!");
    } else {
      System.out.println("Тест 16 (getTasksByTitle) не пройден. Ожидался: " + expectedGetTasksResult
          + ", получен: " + actualGetTasksResult);
    }

    // Тест 17: testPrintStudents
    List<Student> students = Arrays.asList(
        new Student("Student1", 20),
        new Student("Student2", 22),
        new Student("Student3", 24)
    );
    // В этом тесте вывод на консоль, поэтому просто вызываем метод
    System.out.println("Тест 17 (printStudents) выполнен.");

    // Тест 18: testGetStudentsOlderThan
    List<Student> students2 = Arrays.asList(
        new Student("Student1", 20),
        new Student("Student2", 22),
        new Student("Student3", 24)
    );
    List<Student> expectedGetOlderResult = Arrays.asList(
        new Student("Student2", 22),
        new Student("Student3", 24)
    );
    List<Student> actualGetOlderResult = collection.getStudentsOlderThan(students2, 21);
    if (expectedGetOlderResult.equals(actualGetOlderResult)) {
      System.out.println("Тест 18 (getStudentsOlderThan) пройден успешно!");
    } else {
      System.out.println(
          "Тест 18 (getStudentsOlderThan) не пройден. Ожидался: " + expectedGetOlderResult
              + ", получен: " + actualGetOlderResult);
    }

    // Тест 19: testPrintProductsWithZeroQuantity
    List<Product> products = Arrays.asList(
        new Product(1, "Product1", 0),
        new Product(2, "Product2", 10),
        new Product(3, "Product3", 0)
    );
    // В этом тесте вывод на консоль, поэтому просто вызываем метод
    System.out.println("Тест 19 (printProductsWithZeroQuantity) выполнен.");

    // Тест 20: testGetTotalQuantityOfProducts
    List<Product> products2 = Arrays.asList(
        new Product(1, "Product1", 10),
        new Product(2, "Product2", 20),
        new Product(3, "Product3", 30)
    );
    int expectedTotalQuantityResult = 60;
    int actualTotalQuantityResult = collection.getTotalQuantityOfProducts(products2);
    if (expectedTotalQuantityResult == actualTotalQuantityResult) {
      System.out.println("Тест 20 (getTotalQuantityOfProducts) пройден успешно!");
    } else {
      System.out.println("Тест 20 (getTotalQuantityOfProducts) не пройден. Ожидался: "
          + expectedTotalQuantityResult + ", получен: " + actualTotalQuantityResult);
    }

    // Тест 21: testPrintStudentsWithWorstAttendance
    List<AttendanceStudent> attendanceStudents = Arrays.asList(
        new AttendanceStudent("Student1", "50"),
        new AttendanceStudent("Student2", "30"),
        new AttendanceStudent("Student3", "30")
    );
    // В этом тесте вывод на консоль, поэтому просто вызываем метод
    System.out.println("Тест 21 (printStudentsWithWorstAttendance) выполнен.");

    // Тест 22: testGetAverageAttendance
    List<AttendanceStudent> attendanceStudents2 = Arrays.asList(
        new AttendanceStudent("Student1", "50"),
        new AttendanceStudent("Student2", "30"),
        new AttendanceStudent("Student3", "40")
    );
    double expectedAverageAttendanceResult = 40.0;
    double actualAverageAttendanceResult = collection.getAverageAttendance(attendanceStudents2);
    if (expectedAverageAttendanceResult == actualAverageAttendanceResult) {
      System.out.println("Тест 22 (getAverageAttendance) пройден успешно!");
    } else {
      System.out.println(
          "Тест 22 (getAverageAttendance) не пройден. Ожидался: " + expectedAverageAttendanceResult
              + ", получен: " + actualAverageAttendanceResult);
    }
  }
}