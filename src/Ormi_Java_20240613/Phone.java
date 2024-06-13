package Ormi_Java_20240613;

public abstract class Phone {
  private String owmer;

  public Phone(String owmer) {
    this.owmer = owmer;
  }

  public void turnOn() {
    System.out.println("폰전원을 킵니다!");
  }

  public void turnOff() {
    System.out.println("폰전원을 끕니다!");
  }
}
