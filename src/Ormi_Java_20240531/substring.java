package Ormi_Java_20240531;

// substring은 시작과 끝점!

public class substring {
  public static void main(String[] args) {
    String a = "WEEEE ASKE ;ND";
    System.out.println(a.substring(0, 5));
    System.out.println(a.substring(0, 3) + a.substring(8, 10) + a.substring(12, 14));
  }
}
