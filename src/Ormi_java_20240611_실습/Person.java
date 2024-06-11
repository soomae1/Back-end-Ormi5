package Ormi_java_20240611_실습;

public class Person {
  // 상태, 변수
  String name;
  int phoneNumber;
  int age;
  int money;

  // 상태를 가지고 생성자를 만든다
  // 생성자 // 추상적으로 봤을 때 같은 사람이지만 그 안에 내용은 다름
  public Person(String name, int phoneNumber, int age, int money) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.age = age;
    this.money = money;
  }

  // 생성자로 인해 메서드(기능) 구현
  public void sayHello() {
    System.out.println("my name is " + name);
  }

  public void saymoney() {
    System.out.println("내가 가지고 있는 돈은" + money *10000 + "원이야");
  }

// 파라미터에 스듀던트 클래스를 받는다?
  public void teaching(Student student) {
    student.LevelUP();
    // LevelUP 빨간줄생기면 alt + enter 누르면 스튜던트 클래스 파일에 public void LevelUP() 생성됨!
  }

  // 여기서 먼저 첫번째로 만들어줌!
  public void cheating(Student student) {
    student.LevelDown();
  }

}
