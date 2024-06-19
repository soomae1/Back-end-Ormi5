package Ormi_Java_20240619;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet2 {
  public static void main(String[] args) {
    Set<String> stringsSet = new HashSet<>();

    stringsSet.add("okay"); // 해시코드메소드가 호출되면서 코드가 만들어진다 // okay123
    stringsSet.add("okay1"); // okay1123

    stringsSet.add("Java");
    stringsSet.add("Spring");
    stringsSet.add("Servlet/JSP");
    stringsSet.add("Java");
    stringsSet.add("DBMS");

    System.out.println(stringsSet.size()); // 저장된 객체수

    stringsSet.remove("Java");

    Iterator<String> iterator = stringsSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    stringsSet.clear(); // 비었습니다 호출 // 주석처리하면 비지 않았습니다 호출

    if (stringsSet.isEmpty()) {
      System.out.println("비었습니다");
    } else {
      System.out.println("비지 않았습니다");
    }
  }
}
