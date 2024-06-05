package Ormi_Java_20240531;

// boolean 참과 거짓을 판별
// 파일 - 설정 - 에디터 - 검사 - 도달할 수 없는 코드 - 강조할 수 없음이라고 하면 회색표시 안뜸! 경고라고 하면 뜸!

public class 논리부정연산자 {

  public static void main(String[] args) {
    boolean isRaining = true;

    if (isRaining) {
      System.out.println("하늘에서 비가와요");
    }

    if (!isRaining) {
      System.out.println("김태희가 안옵니다.");
    }

    boolean isSunny = false;

    if (!isSunny) {
      System.out.println("날씨가 맑아요");
    } else {
      System.out.println("집에서 쉬어야죠.");
    }
  }
}
