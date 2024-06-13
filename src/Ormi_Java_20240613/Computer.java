package Ormi_Java_20240613;

public class Computer extends Calculator {

    @Override  // 부모 클래스를 그대로 가져와서 재정의 = 오버라이딩 함
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle메서드 실행");
        return Math.PI * r * r;
    }

    @Override // 오버라이딩할 경우 무조건 붙어줘야함
    void say() {
        System.out.println("오호호호 안녕하십니까?!");
    }


}
