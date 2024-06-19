package Ormi_Java_20240619;

import java.util.Map.Entry;
import java.util.*;

public class CollectionMap3 {
  public static void main(String[] args) {

    Map<String, List<String>> map = new HashMap<>();
    List<String> stringList = new ArrayList<>();
    stringList.add("홍길동");
    stringList.add("홍길동");
    stringList.add("홍길동");
    map.put("홍길동", stringList);

    Set<Entry<String, List<String>>> entries = map.entrySet();

    for (Entry<String, List<String>> entry : entries) {
      String key = entry.getKey();
      List<String> value = entry.getValue();
    }
  }
}
