package Ormi_Java_20240614;

import java.util.Scanner;

public class Finally {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      int i = sc.nextInt();
      int result = i / 0;
      System.out.println(result);
    } catch (NullPointerException e) {
      System.out.println("0으로 나눌 수 없습니다");
    } finally {
      System.out.println("이건 예외여부와 상관없이 항상 실행됩니다.");
      sc.close();
    }
  }
}
