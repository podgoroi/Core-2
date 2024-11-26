package test;

import java.util.Arrays;
import java.util.List;
import task.generics.Generics;

public class GenericsTest {

  public static void main(String[] args) {
    // Тест 1: testGetFirstElement
    List<String> list1 = Arrays.asList("A", "B", "C");
    String expectedFirstResult = "A";
    String actualFirstResult = Generics.getFirstElement(list1);
    if (expectedFirstResult.equals(actualFirstResult)) {
      System.out.println("Тест 1 (getFirstElement) пройден успешно!");
    } else {
      System.out.println(
          "Тест 1 (getFirstElement) не пройден. Ожидался: " + expectedFirstResult + ", получен: "
              + actualFirstResult);
    }

    // Тест 2: testGetLastElement
    List<Integer> list2 = Arrays.asList(1, 2, 3);
    Integer expectedLastResult = 3;
    Integer actualLastResult = Generics.getLastElement(list2);
    if (expectedLastResult.equals(actualLastResult)) {
      System.out.println("Тест 2 (getLastElement) пройден успешно!");
    } else {
      System.out.println(
          "Тест 2 (getLastElement) не пройден. Ожидался: " + expectedLastResult + ", получен: "
              + actualLastResult);
    }

    // Тест 3: testMergeLists
    List<String> list3 = Arrays.asList("A", "B");
    List<String> list4 = Arrays.asList("C", "D");
    List<String> expectedMergeResult = Arrays.asList("A", "B", "C", "D");
    List<String> actualMergeResult = Generics.mergeLists(list3, list4);
    if (expectedMergeResult.equals(actualMergeResult)) {
      System.out.println("Тест 3 (mergeLists) пройден успешно!");
    } else {
      System.out.println(
          "Тест 3 (mergeLists) не пройден. Ожидался: " + expectedMergeResult + ", получен: "
              + actualMergeResult);
    }

    // Тест 4: testGetUniqueElements
    List<Integer> list5 = Arrays.asList(1, 2, 2, 3, 3, 3);
    List<Integer> expectedUniqueResult = Arrays.asList(1, 2, 3);
    List<Integer> actualUniqueResult = Generics.getUniqueElements(list5);
    if (expectedUniqueResult.equals(actualUniqueResult)) {
      System.out.println("Тест 4 (getUniqueElements) пройден успешно!");
    } else {
      System.out.println(
          "Тест 4 (getUniqueElements) не пройден. Ожидался: " + expectedUniqueResult + ", получен: "
              + actualUniqueResult);
    }
  }
}