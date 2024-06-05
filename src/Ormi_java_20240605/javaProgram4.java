package Ormi_java_20240605;

import java.util.Random;
import java.util.Scanner;

public class javaProgram4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    int targetNumber = random.nextInt(100) + 1;
    int userGuess;

    while (true) {
      System.out.println("숫자를 입력해주세요!");
      userGuess = sc.nextInt();

      if (userGuess < targetNumber) {
        System.out.println("더 높은 숫자입니다.");
      } else if (userGuess > targetNumber) {
        System.out.println("더 낮은 숫자입니다.");
      } else {
        System.out.println("정답입니다! 숫자는 " + targetNumber + "입니다.");
        break;
      }
    }
    sc.close();
  }
}
