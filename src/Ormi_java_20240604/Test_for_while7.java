package Ormi_java_20240604;

// 퀴즈 2: 문자열 배열 names가 주어졌을 때, 향상된 반복문을 사용하여 이름의 길이가 5 이상인 이름만 출력하는 코드를 작성하세요.

public class Test_for_while7 {
  public static void main(String[] args) {

    String[] arr = {"dsjdis", "banana", "happy", "ormii", "sleep"};
    for (String names : arr) {
      if (names.length() >= 5) {
        System.out.println(names);
      }
    }
  }
}
