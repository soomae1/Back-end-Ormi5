package Ormi_java_20240605;

import java.util.ArrayList;
import java.util.Random;

public class javaProgram3 {
  public static void main(String[] args) {
    Random random = new Random();
    ArrayList<Integer> list = new ArrayList<Integer>(); // 로또 번호 6개를 담을 리스트틀 먼저 만든다!!!!
    // 이걸 더 많이 사용함 int[] arr = new int[6]; 이 형태를 이렇게 사용함!
    // <> 타입! Integer wrapper클래스
    // 기본타입들을 클래스로 사용하기 위해 래퍼클래스가 존재한다?

    while (list.size() < 6) { // != 6 이렇게도 가능 // 그 공간이 6개까지 만들동안
      int i = random.nextInt(45) + 1; // 랜덤할 값을 하나 뽑는다

      if (!list.contains(i)) { // 리스트에 있는게 포함되지 않는다면
        list.add(i); // 포함한다
      }
    }

    for (int data : list) { // 향상된 반복문으로 값을 출력한다!
      System.out.println(data);
    }
  }
}

// set이 엄청 깔끔함!!!! 이렇게하면 중복값이 없다?

/*
Set<Integer> set = new HashSet<>();

    while(set.size()!=6){
int number = random.nextInt(45) + 1;
      set.add(number);
    }
*/
