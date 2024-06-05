package Ormi_java_20240604;

/*문제:
사용자로부터 정수 n을 입력받아, 1부터 n까지의 정수 중에서 3의 배수이면서 5의 배수인 수의 합을 계산하여 출력하는 프로그램을 작성하세요.
예시:

입력: 20
출력: 30

설명:1부터 20까지의 정수 중에서 3의 배수이면서 5의 배수인 수는 15 하나뿐입니다. 따라서 출력 결과는 15입니다.
이 문제에서는 for문을 사용하여 1부터 n까지의 정수를 순회하면서, 3의 배수이면서 5의 배수인 수를 찾아 그 합을 계산해야 합니다.*/

public class Test_for3 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 20; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
