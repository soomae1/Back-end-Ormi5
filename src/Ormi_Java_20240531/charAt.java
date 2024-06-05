package Ormi_Java_20240531;

// "" 이거 하나만 해도 문자열로 바뀜 안하면 숫자로 나옴

public class charAt {
  public static void main(String[] args) {
    String findChar = "What is your hobby";
    System.out.println(
        findChar.charAt(13)
            + ""
            + findChar.charAt(14)
            + findChar.charAt(15)
            + findChar.charAt(16)
            + findChar.charAt(17));
  }
}
