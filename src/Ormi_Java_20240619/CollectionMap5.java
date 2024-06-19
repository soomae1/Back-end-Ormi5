package Ormi_Java_20240619;

/*1.student 클래스를 만드는데 여기서는 no라는 int형, 그리고 name이라는 변수에는 String형
HashMap 구현 키는 Student, value (점수)int
데이터 넣기 put 메서드활용
entrySet()활용해서 getKey(), getValue() 메서드로 키와 값을 추출해 출력*/

// HashMap 사용하는 방법

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionMap5 {
  public static void main(String[] args) {

    Map<Student, Integer> studentIntegerMap = new HashMap<>();

    studentIntegerMap.put(new Student(0, "홍길동"), 80);
    studentIntegerMap.put(new Student(1, "김수민"), 90);
    studentIntegerMap.put(new Student(2, "문종건"), 95);

    Set<Entry<Student, Integer>> entries = studentIntegerMap.entrySet();

    for (Entry<Student, Integer> entry : entries) {
      String name = entry.getKey().getName();
      int no = entry.getKey().getNo();
      Integer value = entry.getValue();
    }
  }
}
