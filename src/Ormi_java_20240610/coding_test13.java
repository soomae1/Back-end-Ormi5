package Ormi_java_20240610;

// 주어진 문자열에서 각 문자마다 동일한 문자를 한 번 더 추가한 문자열을 반환하세요.

/*System.out.println(repeatChar("The")); // "TThhee"
System.out.println(repeatChar("AAbb")); // "AAAAbbbb"
System.out.println(repeatChar("Hi-There")); // "HHii--TThheerree"
 */

public class coding_test13 {
  public static void main(String[] args) {
    System.out.println(repeatChar("The"));
  }

  static String repeatChar(String str) {
    String resuit = "";

    for (int i = 0; i < str.length(); i++) {
      char theChar = str.charAt(i);
      resuit += "" + (theChar) + (theChar);
      // 문자열의 주소값이 다르기 때문에 String.valueOf을 사용해줘야 문자열처럼 나옴

    }
    return resuit;
  }
}
