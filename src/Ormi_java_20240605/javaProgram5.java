package Ormi_java_20240605;

import java.util.Scanner;

public class javaProgram5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("영화 제목을 입력하세요");
    String title = sc.nextLine();

    System.out.println("관람 인원 수를 입력하세요");
    int people = sc.nextInt();
    sc.nextLine(); // 개행 문자 제거

    System.out.println("예매자의 이름을 입력하세요");
    String name = sc.nextLine();

    System.out.println("예매자의 전화번호를 입력하세요");
    String number = sc.nextLine();

    int ticketprice = 10000;
    int totalprice = ticketprice * people;

    System.out.println("===== 영화 티켓 예매 정보 =====");
    System.out.println("영화 제목: " + title);
    System.out.println("관람 인원: " + people + "명");
    System.out.println("예매자 이름: " + name);
    System.out.println("예매자 전화번호: " + number);
    System.out.println("총 결제 금액: " + totalprice + "원");

    sc.close();
  }
}
