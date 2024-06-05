package Ormi_java_20240604;

// while이 참일 동안 무한루프~~~ , 무조건 조건이 참!

public class Test_While4 {
  public static void main(String[] args) {
    int i = 0;
    while (i <= 300) {
      if (i % 3 == 0) {
        System.out.println(i);
      }
      i++;// 이게 있어야 숫자가 나옴!!
    }
  }
}
