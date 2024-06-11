package Ormi_java_20240611_과제;

public class Main {
  public static void main(String[] args) {
    PersonSooMin PersonSooMin = new PersonSooMin("김수민", "자바공부", "istj", 26);
    PersonSooMin.sayHello();
    System.out.println();

    Friend friend = new Friend("문종건", 28);
    Friend.Hello();
    System.out.println();

    PersonSooMin.teaching(friend);
    PersonSooMin.teaching(friend);
    PersonSooMin.teaching(friend);
  }
}
