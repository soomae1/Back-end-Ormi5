package Ormi_java_20240611_과제;

public class PersonSooMin {

  // 멤버변수
  String name;
  String hobby;
  String mbti;
  int age;

  // 생성자
  public PersonSooMin(String name, String hobby, String mbti, int age) {
    this.name = name;
    this.hobby = hobby;
    this.mbti = mbti;
    this.age = age;
  }

  // 메서드
  public void sayHello() {
    System.out.println("안녕 : D 내 이름은 " + name + "이고! 나이는 " + age + "살이야");
    System.out.println("내 MBTI는 " + mbti + "야!");
    System.out.println("내 취미는 " + hobby + "지!");
    System.out.println("내가 자바 알려줄게~!");
  }

  public void teaching(Friend friend) {
    friend.levelUp();
  }
}
