package Ormi_java_20240603;

public class 문자열연결연산자 {
  public static void main(String[] args) {

    String str1 = "Hello!";
    String str2 = str1 + "Nice to meet you";

    System.out.println(str2); // Hello!Nice to meet you

    // 문자열 "Hello"와 123이 먼저 연산되어 "Hello123"이 되고,
    // 이것을 다시 456과 연산하여 "Hello123456"이 됩니다.
    System.out.println("Hello" + 123 + 456); // Hello123456

    // 숫자 123과 456이 먼저 연산되어 579가 되고,
    // 이것을 문자열 "Hello"와 연산하여 "579Hello"가 됩니다.
    System.out.println(123 + 456 + "Hello"); // 579Hello

    StringBuilder sb = new StringBuilder();
    sb.append(123);
    sb.append(456);
    sb.append("Hello");
    System.out.println(sb);
  }
}
