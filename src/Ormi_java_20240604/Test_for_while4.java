package Ormi_java_20240604;

// continue의 경우 해당 숫자 뺴고 계속 실행한다~! (거르기기능!)
// 증감식이 있으니까 1부터 9까지 3빼고 출력 값이 나온다!

public class Test_for_while4 {
  public static void main(String[] args) {
    int number = 0;
    while (number < 10) {
      number++;
      if (number == 3) {
        continue;
      } else {
        System.out.println("현재 값은 : " + number);
      }
    }

    for (int i = 0; i < 10; i++) {
      if (i == 3) {
        continue;
      }
      System.out.println("현재 값은 : " + i);
    }
  }
}

    // 목표: 1부터 10까지 숫자를 출력하세요. 이때 4와 7은 건너뛰고 출력합니다.
    // 두 조건이 다 성립하려면 || or을 써야 한다!!
/*
   for (int i = 1; y <= 10; y++) {
    if (y == 4 || y == 7) {
      continue;
    }
    System.out.println(y);
  }
}

*/
