package Ormi_java_20240611_과제;

public class Friend {
  int ability;
  static String name;
  static int age;

  public Friend(String name, int age) {
    this.ability = 8;
    this.name = name;
    this.age = age;
  }

  public static void Hello() {
    System.out.println("안녕 : D 내 이름은 " + name + "이고 나이는 " + age + "살이야!");
  }

  public void levelUp() {
    if (ability < 10) {
      ability++;
      System.out.println("왕! 자바실력이 1레벨 증가 했어!");
      System.out.println("자바실력이 " + ability + "(이)야!!");
    } else {
      System.out.println("자바실력이 엄청 늘었잖아!? 이스트소프트 인턴십에 지원해야지!");
    }
  }
}
