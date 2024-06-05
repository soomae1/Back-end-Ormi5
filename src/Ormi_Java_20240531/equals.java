package Ormi_Java_20240531;

public class equals {
  public static void main(String[] args) {
    String a = "hello";
    String b = new String("hello");

    System.out.println(a.equals(b)); // true
    System.out.println(a == b); // false
  }
}
