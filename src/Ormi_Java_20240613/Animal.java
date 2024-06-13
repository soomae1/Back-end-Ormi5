package Ormi_Java_20240613;

public abstract class Animal { //abstract을 해야지 추상클래스임
  String name;
  String gender;

  public void setName(String name) {
    this.name = name;
  }

  public Animal(String name,String gender) {
    this.name = name;
    this.gender = gender;
  }

  public void sleep() {
    System.out.println(this.name + " Zzzzz...");
  }

  protected String kind;

  public void breath() { // 일반 클래스
    System.out.println("숨을 쉽니다.");
  }

  public abstract void sound(); // 추상 클래스 이걸 사용하면 자식클래스는 추상클래스 메서드를 만들어야함
}
