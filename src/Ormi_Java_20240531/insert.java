package Ormi_Java_20240531;

public class insert {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    sb.append("hello");
    sb.insert(0, "world"); // insert는 몇번째 위치에 추가한다? 이런느낌!
    sb.insert(0, "world");
    sb.insert(0, "world");
    sb.insert(0, "world");
    System.out.println(sb);
  }
}
