package Ormi_java_20240603;

// 5문제: 변수 language에 "Java", "Python", "C++", "JavaScript" 중 하나의 문자열이 저장되어 있습니다.
// 각 프로그래밍 언어에 대한 간단한 설명을 출력하는 코드를 작성하세요.

public class Test_Switch6 {
  public static void main(String[] args) {
    String language = "Java";
    switch (language) {
      case "Java":
        System.out.println("자바는 객체지향 프로그래밍 언어");
        break;

      case "Python":
        System.out.println("몰라요!");
        break;

      case "C++":
        System.out.println("저수준 언어로 메모리에서 사용하지 않는 객체는 개발자가 직접 코드 작성해서 삭제");
        break;

      case "JavaScript":
        System.out.println("정적으로 동작하는 웹");
        break;
    }
  }
}
