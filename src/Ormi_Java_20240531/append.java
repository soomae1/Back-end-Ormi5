package Ormi_Java_20240531;

// append는 문자열을 추가하는 것! String에는 없음!!

public class append {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("Hello ");
    sb.append("java");
    sb.append("World");
    System.out.println(sb);

    StringBuffer sf = new StringBuffer();
    sf.append("Hello ");
    sf.append("java");
    sf.append("World");
    System.out.println(sf);
  }
}
