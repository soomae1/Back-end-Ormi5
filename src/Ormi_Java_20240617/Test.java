package Ormi_Java_20240617;

public class Test {
  public static void main(String[] args) {
    Phone applePhone = new ApplePhone();
    Phone samsungPhone = new SamsungPhone();

    System.out.println(applePhone.call());
    System.out.println(samsungPhone.call());

    System.out.println(applePhone.answerThePhone());
    System.out.println(samsungPhone.answerThePhone());

    InterfaceC impleC = new ImpleC();

    InterfaceA interfaceA = impleC;
    interfaceA.methodA();
    System.out.println("=================");

    InterfaceB interfaceB = impleC;
    interfaceB.methodB();
    System.out.println("=================");

    impleC.methodA();
    impleC.methodB();
    impleC.methodC();

    Car kiaCar = new KiaCar(); // 카라는 건 모든 구현클래스에 확장해서 쓰고 있으므로 기아카뿐만아니라. 다른 카 이름이 와서 쓰일수도 있음
    System.out.println(kiaCar.getTier());
    System.out.println(kiaCar.showEngine());
    System.out.println(kiaCar.amountNavi());
  }
}
