package Ormi_Java_20240617.generic2;

public class Box<T> { // 타입의 약자
  private T t; // 위에 티와 일치해야함?

  public void set(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }

  public boolean isIns() {
    return t instanceof String;
  }

}
