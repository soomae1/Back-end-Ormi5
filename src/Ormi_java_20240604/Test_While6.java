package Ormi_java_20240604;

// 문제2 : 주어진 배열에서 양수의 합과 음수의 합을 각각 구하여 출력하는 프로그램을 작성하세요!
// int[] numbers = {4, -2, 9, -7 ,5, 1, -3, 6, -1, 8};

public class Test_While6 {
  public static void main(String[] args) {
// 강사님이 알려주신 참고사항
// int posNum = IntStream.of(numbers).filter(num -> num > 0).sum();
// int neNum = IntStream.of(numbers).filter(num -> num < 0).sum();

    int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
    int positiveSum = 0;
    int negativeSum = 0;
    int i = 0;

    while (i < numbers.length) {
      if (numbers[i] > 0) {
        positiveSum += numbers[i];
      } else {
        negativeSum += numbers[i];
      }
      i++;
    }
    System.out.println(positiveSum);
    System.out.println(negativeSum);
  }
}
