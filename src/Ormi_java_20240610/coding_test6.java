package Ormi_java_20240610;

// 문자열 데이터를 전달 받으면 각각의 문자열 사이에 @ 표시를 집어 넣는 함수를 만들어 봅니다.
// 단, 재귀 함수를 이용하여 풀어보세요.
/*System.out.println(printAt("hello")); // "h@e@l@l@o"
static String printAt(String str){}*/

public class coding_test6 {
  public static void main(String[] args) {
    System.out.println(PrintAt("hello"));
  }

  // 재귀함수로 출력하는 방법!
  static String PrintAt(String str) {
    if (str.length() <= 1) {
      return str;
    }

    // 첫 번째 문자와 나머지 문자열 사이에 @를 삽입하고 재귀 호출
    return str.charAt(0) + "@" + PrintAt(str.substring(1));
  }
}
