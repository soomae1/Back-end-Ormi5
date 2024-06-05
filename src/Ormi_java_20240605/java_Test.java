package Ormi_java_20240605;

/*문제:
문자열 배열 String[] words가 주어집니다. 이 배열에는 여러 단어들이 저장되어 있습니다.
이중 포문을 사용하여 모든 단어 쌍의 조합을 출력하는 프로그램을 작성하세요.
단, 같은 단어를 중복해서 출력하면 안 되며, 단어 쌍의 순서는 고려하지 않습니다.*/

public class java_Test {
  public static void main(String[] args) {
    String[] words = {"apple", "banana", "cherry", "durian"};
    for (int i = 0; i < words.length - 1; i++) {
      for (int j = i + 1; j < words.length; j++) {
        System.out.println("단어는 : " + words[i] + " " + words[j]);
      }
    }
  }
}
