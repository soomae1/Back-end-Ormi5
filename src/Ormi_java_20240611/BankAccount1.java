package Ormi_java_20240611;

public class BankAccount1 {
  private String accountNumber; // 클래스 안에서만 사용하는 멤버변수
  private String ownerName; // 클래스 안에서만 사용하는 멤버변수
  private double balance; // 클래스 안에서만 사용하는 멤버변수

  public BankAccount1(String accountNumber, String ownerName) { // 외부에서 받아옴!
    this.accountNumber = accountNumber;
    this.ownerName = ownerName;
    this.balance = 0.0; // 변수 초기화
  }

  // 입금 메소드
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println(amount + "원이 입금되었습니다.");
    } else {
      System.out.println("유효하지 않은 금액입니다.");
    }
  }

  // 출금 메소드
  public void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
      System.out.println(amount + "원이 출금되었습니다.");
    } else {
      System.out.println("잔액이 부족합니다.");
    }
  }

  // 잔액 조회 메소드
  public void printBalance() {
    System.out.println("현재 잔액: " + balance + "원");
  }
}
