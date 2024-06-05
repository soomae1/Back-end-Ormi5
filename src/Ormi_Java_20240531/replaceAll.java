package Ormi_Java_20240531;

// replaceAll을 제일 많이 쓰고 replace를 써도 값은 똑같다! replaceFirst를 썼을 때 처음열만 밑에 내용으로 바뀐다
// replaceAll 정규표현식이면 사용 / replace는 문자열이면 사용 -> 차이점

public class replaceAll {
  public static void main(String[] args) {
    String a = "Hello World! Hello World! Hello World!";
    System.out.println(a.replaceAll("World", "Java"));

    String b = "Hello World! Hello World! Hello World!";
    System.out.println(a.replace("World", "Java"));

    String c = "Hello World! Hello World! Hello World!";
    System.out.println(a.replaceFirst("World", "Java"));
  }
}
