package Ormi_Java_20240619;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
  public static void main(String[] args) {
    Set<Integer> integerSet = new HashSet<>();

    integerSet.add(1);
    integerSet.add(1);
    integerSet.add(1);

     integerSet.add(1);
    integerSet.add(2);
    integerSet.add(3);
    integerSet.add(4);
    integerSet.add(5);

    integerSet.add(5);
    integerSet.add(2);
    integerSet.add(3);
    integerSet.add(1);
    integerSet.add(4);

    System.out.println(integerSet.size()); // Set은 중복을 허용하지 않으니 1 하나만 나온다!
    Iterator<Integer> iterator = integerSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    while (iterator.hasNext()) {
      iterator.next();
      iterator.remove();
    }

    for (int a : integerSet) {
      System.out.println(a);
    }
  }
}
