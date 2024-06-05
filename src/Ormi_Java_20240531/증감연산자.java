package Ormi_Java_20240531;

// 단항연산자 증감연산자 (++, --) / 전위증감연산자,후위증감연산자

public class 증감연산자 {

  public static void main(String[] args) {
    int x = 5;
    int y = 5;

    System.out.println("전위 증가 연산자: " + (++x)); //   앞에 있으면 먼저 증가시키고 x값을 출력한다
    System.out.println("후위 증가 연산자: " + (y++)); //   뒤에 있으면 먼저 y값을 출력하고 나중에 증가시킨다

    System.out.println("=================");
    System.out.println("x는" + x);
    System.out.println("y는" + y);


    int a = 100;
    int b = 100;

    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));
    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));
    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));
  }
}
