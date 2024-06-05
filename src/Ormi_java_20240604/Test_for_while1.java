package Ormi_java_20240604;

public class Test_for_while1 {
  public static void main(String[] args) {
    int number = 0;
    while (number < 10) {
      System.out.println("현재 숫자는 : " + number);
      if (number == 5) {
        System.out.println("5가 되었습니다.");
        break;
      }
      number++;
    }
    for (int i = 0; i < 10; i++) {
      System.out.println("현재 숫자: " + i);
      if (i == 5) {
        break;
      }
    }
  }
}
