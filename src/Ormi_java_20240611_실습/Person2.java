package Ormi_java_20240611_실습;

public class Person2 {
  public static void main(String[] args) {
    Person person1 = new Person("김수민", 123485678, 26, 100000);
    person1.sayHello();
    person1.saymoney();
    Person person2 = new Person("구렁이", 254888666, 23, 5000);
    person2.sayHello();
    person2.saymoney();
    Person person3 = new Person("양배추", 238788599, 21, 1000);
    Person person4 = new Person("누룽지", 465888885, 29, 500);

    Student student = new Student();
    person1.teaching(student);
    person1.cheating(student);

    // 클래스 하나에서 다 가능하지만 너무 길어지니까 객체지향은 각각 클래스를 만들어서 엮어서 만듬!

  }
}
