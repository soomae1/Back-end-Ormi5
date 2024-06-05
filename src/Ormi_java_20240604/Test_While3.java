package Ormi_java_20240604;

// - (중) 주어진 배열 numbers에 저장된 숫자들의 평균을 계산하여 출력하는 코드를 while문을 사용하여 작성하세요.
// - 주어진 배열: numbers = [5, 2, 9, 1, 7, 4, 6, 3, 8]

public class Test_While3 {
  public static void main(String[] args) {
    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    int i = 0;
    int sum = 0;

    while (i < numbers.length) {
      sum += numbers[i];
      i++;
    }
    System.out.println("숫자 평균은 " + sum / numbers.length);
  }
}
