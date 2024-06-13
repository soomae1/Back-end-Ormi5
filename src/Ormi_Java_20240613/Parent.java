package Ormi_Java_20240613;

public class Parent {
    int money1;

  public void save() {
      this.money1 += 10000;
    System.out.println("투자한 금액은 "+ money1 + "원 입니다.");
    System.out.println("현재 잔고는 " + money1 + "원 입니다");
  }

    void method1() {
        System.out.println("Parent의 method1 호출");
    }

    void method2() {
        System.out.println("Parent의 method2 호출");
    }


}
