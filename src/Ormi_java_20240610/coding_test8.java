package Ormi_java_20240610;

/**
 * 세 개의 정수 a, b, c가 주어졌을 때, 두 개의 정수를 더해서 세 번째 정수를 만들 수 있으면 true를 반환하는 코드를 작성합니다. 메서드 본문은 단 한 줄의
 * 코드로작성되어야 합니다. twoSumOne(1, 2, 3) --->true twoSumOne(3, 1, 2) --->true twoSumOne(3, 2, 2)
 * --->false
 */

// public static boolean twoSumOne(int a, int b, int c)

public class coding_test8 {
  public static void main(String[] args) {
    System.out.println(twoSumOne(1, 2, 3));
  }

  public static boolean twoSumOne(int a, int b, int c) {
    return (a + b == c) || (a + c == b) || (b + c == a);
  }
}
