package Ormi_java_20240605;

// nextInt : 정수, nextLine: 문자열

import java.util.Scanner;

public class java_Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("정수를 입력하세요.");
    int number = sc.nextInt();
    sc.nextLine();
    System.out.println("문자열을 입력하세요.");

    String line = sc.nextLine();

    System.out.println("정수는 =  " + number);
    System.out.println("문자열은 =  " + line);

    sc.close();
  }
}
