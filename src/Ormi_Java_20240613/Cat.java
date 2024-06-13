package Ormi_Java_20240613;

public class Cat extends Animal {

  public Cat() {
      super("하이","여자");
      this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("miumiu");
  }
}
