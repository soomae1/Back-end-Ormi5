package Ormi_java_20240604;

/* 구구단 2단 출력하기!
목표: 반복문을 사용하여 구구단 2단을 출력하는 프로그램을 작성하세요.
조건:
1. 반복문을 사용하여 1부터 9까지 2와 곱하는 작업을 반복합니다.
2. 구구단은 한 줄에 하나씩 출력되며, 각 줄에는 "<단> × <곱할 숫자> = <결과>" 형식으로 출력합니다.*/

public class Test_for10 {
  public static void main(String[] args) {

    // 구구단 19단을 역방향으로 출력하는 프로그램을 작성하세요.
    for (int i = 19; i >= 1; i--) {
      for (int j = 19; j >= 1; j--) {
        System.out.println(i + "x" + j + "=" + (i * j));
      }
    }

    // 2단
    for (int i = 1; i < 10; i++) {
      System.out.println(2 + "x" + i + "=" + i);
    }

    // 구구단
    for (int i = 2; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.println(i + "x" + j + "=" + i);
      }
    }


  }
}
