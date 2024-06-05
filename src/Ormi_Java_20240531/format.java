package Ormi_Java_20240531;

public class format {
  public static void main(String[] args) {
    String name1 = "Tim";
    int age1 = 30;

    String name2 = "Anna";
    int age2 = 45;

    String d1 = String.format("%s의 나이는 %s세 입니다", name1, age1);
    String d2 = String.format("%s의 나이는 %s세 입니다", name2, age2);

    System.out.println(d1);
    System.out.println(d2);
  }
}
