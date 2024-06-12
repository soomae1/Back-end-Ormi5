package Ormi_Java_20240612;

public class Person {
  String name;
  int age;

  final String animals; // 인스턴스로 인해 여러가지 버전을 만들 수 있어서 상수라고는 할 수 없음

  static final String GENDER = "여자"; // 상수이면서 person 클래스에서만 사용가능
  static final int FOOTSIZE = 235; // 상수(static final) 은 네이밍할 때 단어끼리 언더바(_)묶고 대문자 형식
  static final String NOTEBOOKNAME = "LG그램"; // 인스턴스를 만들지 않아도 접근 가능 , 딱 하나만!

  public Person(String name, int age, String animals) {
    this.name = name;
    this.age = age;
    this.animals = "rabbit";
  }

  public void sayhello() {
    System.out.println("Hello, my name is " + this.name);
  }

  public void introduce() {
    System.out.println(" I am" + this.age + " years old");
  }

 static  {
    System.out.println(" 내 성별은 " + GENDER + " 야");
  }
}
