package Ormi_java_20240604;

// - (하) 1부터 주어진 양의 정수 n까지의 합을 계산하여 출력하는 코드를 while문을 사용하여 작성하세요.
//        - 주어진 값: n = 100

public class Test_While2 {
  public static void main(String[] args) {

    int i = 1;
    int n = 100;
    int sum = 0;
    while (n >= i) {
      sum += i;
      i++;
    }
    System.out.println("양의 정수의 합은 : " + sum);

    // int sum = IntStream.rangeClosed(1, 100).sum();
    // System.out.println(sum);
    // 강사님 참고사항

  }
}
