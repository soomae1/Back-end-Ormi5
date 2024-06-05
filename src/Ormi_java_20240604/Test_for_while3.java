package Ormi_java_20240604;

// 이중포문을 만든다. i -> 1~100, j -> 2-> 100
// i가 50이되면 break, j는 80되면  break;

public class Test_for_while3 {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      System.out.println("현재 i의 값은 = " + i);
      if (i == 50) {
        break;
      }
      for (int j = 2; j <= 100; j++) {
        System.out.println("현재 j의 값은 = " + j);
        if (j == 80) {
          break;
        }
      }
    }
  }
}
