package Ormi_Java_20240613;

public class Child extends Parent {

  public void invest() {
    super.money1 = money1;
    int money2 = 0;
    System.out.println("저축한 금액은 " + money1 + "원 입니다.");
    System.out.println("현재 잔고는 " + money1 + "원 입니다");
  }

  void method2() { // 옆에 이상한 모양은 부모의 메소드를 재정의한다라는 뜻이다
    System.out.println("Child의 메서드2 호출");
  }

  void method3() {
    System.out.println("Child의 메서드3 호출");
  }
}
