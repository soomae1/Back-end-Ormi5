package Ormi_Java_20240614;

import java.util.Scanner;

public class quiz1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.println("첫 번째 숫자를 입력하세요");
      int a = scanner.nextInt();
      System.out.println("두 번째 숫자를 입력하세요");
      int b = scanner.nextInt();

      int result = a / b;
      System.out.println("값은 " + result + "입니다"); // b가 0이 아니면 이게 출력됨!

    } catch (ArithmeticException e) { // b가 0이면 ArithmeticException이게 터짐!
      System.out.println("0으로 나눌 수 없습니다");
    } finally {
      scanner.close(); // 마지막은 파이널리로 적어주는게 좋음!
    }
  }
}
