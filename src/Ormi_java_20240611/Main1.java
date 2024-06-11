package Ormi_java_20240611;

import java.util.Scanner;

public class Main1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 계좌 생성
    System.out.print("계좌번호를 입력하세요: ");
    String accountNumber = scanner.nextLine();
    System.out.print("소유자 이름을 입력하세요: ");
    String ownerName = scanner.nextLine();
    BankAccount1 account = new BankAccount1(accountNumber, ownerName);

    // 입금 및 출금
    account.deposit(50000); // 예시 입금
    account.withdraw(30000); // 예시 출금

    // 잔액 조회
    account.printBalance();

    scanner.close();
  }
}
