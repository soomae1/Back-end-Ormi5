package Ormi_java_20240603;

// 2문제: 변수 `operator`에 '+', '-', '*', '/' 중 하나의 문자가 저장되어 있습니다.
// 두 개의 정수형 변수 `num1`과 `num2`의 값에 따라 해당 연산을 수행하고 결과를 출력하는 코드를 작성하세요.

public class Test_Switch3 {
  public static void main(String[] args) {
    char operator = '+';
    int num1 = 1;
    int num2 = 2;

    switch (operator) {
      case '+':
        System.out.println(num1 + num2);
        break;

      case '-':
        System.out.println(num1 - num2);
        break;

      case '*':
        System.out.println(num1 * num2);
        break;

      case '/':
        System.out.println(num1 / num2);
        break;
    }
  }
}
