package Ormi_java_20240607;

/*
문제
주어진 문자열의 길이가 홀수인 경우, 문자열의 가운데 3글자를 반환하는 함수를 작성하세요.
예를 들어, 문자열 "Monitor"의 경우 "nit"을 반환해야 합니다.
만약 문자열의 길이가 3보다 작으면, 문자열 자체를 반환하세요.

예제
입력: "Monitor"
출력: "nit"

요구사항
문자열의 길이가 홀수인 경우, 가운데 3글자를 반환합니다.
문자열의 길이가 3보다 작으면, 문자열을 그대로 반환합니다.*/

public class coding_test1 {

  static String getMiddleThree(String str) {
    String result = str;
    // Monitor
    // "Monitor".length()/2
    // "hellowolr".length()/2
    // substring()
    if (str.length() >= 3) {
      int midIdx = str.length() / 2;

      result = str.substring(midIdx - 1, midIdx + 2);
    }

    return result;
  }
}
