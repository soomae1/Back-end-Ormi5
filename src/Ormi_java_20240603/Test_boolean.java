package Ormi_java_20240603;

public class Test_boolean {
  public static void main(String[] args) {
    int a = 10;
    int b = 5;

    boolean result1 = (a > 5) && (b < 10); // true && true => true
    boolean result2 = (a > 5) || (b > 10); // true && false => true
    boolean result3 = !(a > 5); // !true => false

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);

    int three = 3;
    int five = 5;
    int two = 2;

    boolean result = (five > three) || (five < two) && (five < three);
    // true || false && false => true
    System.out.println(result);

    // 논리연산자 문제

    // 당신은 세 개의 불리언(boolean) 변수 x, y, z를 가지고 있습니다.
    // 이 변수들에 대해 다음 조건을 만족하는 프로그램을 작성하세요:
    // x가 true이고, y가 false일 때, "조건 1 충족"을 출력합니다.
    // y와 z 둘 다 true이거나, x와 z 둘 다 false일 때, "조건 2 충족"을 출력합니다.
    // x, y, z 중 하나라도 true이면 "적어도 하나는 참"을 출력합니다.
    // 세 변수 모두 false일 때, "모두 거짓"을 출력합니다.

    boolean x = true, y = false, z = true;

    if (x && !y) {
      System.out.println("조건 1 충족");
    } else if ((y && z) || (!x && !z)) {
      System.out.println("조건 2 충족");
    } else if (x || y || z) {
      System.out.println("적어도 하나는 참");
    } else if (!x && !y && !z) {
      System.out.println("모두 거짓");
    }
  }
}
