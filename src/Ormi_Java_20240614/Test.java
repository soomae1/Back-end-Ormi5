package Ormi_Java_20240614;

public class Test {
  public static void main(String[] args) {
    try {
      int result = 10 / 0; // 0으로 나눌 수 없으니까 나오는 예외! // 트라이캐취 설명중!
      System.out.println(result);

      int result1 = 10 / 2; // 이건 정상적으로 돌아가는 코드
      System.out.println(result1);

    } catch (ArithmeticException e) { // 보통 e로 변수이름을 함 // 10/2만 있으면 정상적으로 실행 // 10/0은 캐치문으로 나옴!
      System.out.println("0으로 나눌 수 없습니다!"); // 여기서 예외처리를 해줬기 때문에 밑에 정상적으로 종료되었다는 메세지도 같이 출력됨
    }
    System.out.println("정상적으로 종료되었습니다!"); // 강제로 한게 아니기 때문에 언체크드 예외임!
      // 체크드랑 언체크드는 컴파일러 입장에서 생각해보는게 좋음
      // 언체크드는 = 런타임입셉션 = 자바 코드 실행 중에 나와서 예측가능 개발자가 핸들링 가능하니까 예외처리 안됨?
      // 체크드는 컴파일러 시점에서 무조건 예외처리 해줘야해
  }
}
