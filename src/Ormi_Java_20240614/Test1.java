package Ormi_Java_20240614;

public class Test1 {

  public static void main(String[] args) {
    try {
      divide(10, 0);
    } catch (ArithmeticException | NullPointerException e) {
      System.out.println("0으로 나눌 수 없습니다");
    }
    System.out.println("정상적으로 종료되었습니다");
  }

  private static int divide(int a, int b) throws ArithmeticException {
    return a / b;
  }

  // divide는 메인이 호출한거임 throws는 메인에서 캐치가 잡음
  // throws 가 없어도 캐치 사용 가능!
  // ArithmeticException이 아니라 nullpointExceptio이면 오류가 뜸!
  // catch 여러번 넣을 수 있다
}
