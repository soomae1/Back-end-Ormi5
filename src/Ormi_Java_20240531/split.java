package Ormi_Java_20240531;

// a.split에서 split을 누르고 alt + enter
// -> 지역변수삽입 클릭하면 String[] split = a.split(":"); 이렇게 나옴
// 잘라서 배열로 바뀐다!

public class split {
  public static void main(String[] args) {
    String a = "a:b:c:d";
    String[] split = a.split(":");
  }
}
