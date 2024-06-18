package Ormi_Java_20240618;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test2 {
  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Spring");
    arrayList.add("Servlet/JSP");
    arrayList.add("DBMS");
    arrayList.add("JPA");

    System.out.println(" 총 객체 수 : " + arrayList.size());

    System.out.println("==============");

    System.out.println("두번째인덱스" + arrayList.get(2));

    System.out.println(arrayList.contains("Java")); // true
    System.out.println(arrayList.contains("java")); // false 앞에 소문자라 다르다

    ArrayList<Objects> objects = new ArrayList<>();

    objects.add(null); // null 값도 값이라 호출했을 때 값이 비어져 있지 않다!
    System.out.println(objects.isEmpty());

    objects.clear();
    System.out.println(objects.isEmpty());
  }
}
