package Ormi_java_20240604;

// 문제: 주어진 배열에서 가장 큰 값을 찾아 출력하는 프로그램을 작성하시오!
// int [] numbers = {10,5,8,20,3,15,9,2}

public class Test_While5 {
  public static void main(String[] args) {
    int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};

    int max = numbers[0];
    int i = 0;
    while (i < numbers.length) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
      i++;
    }
    System.out.println(max);
  }
}
