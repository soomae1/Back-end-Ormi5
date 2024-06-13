package Ormi_Java_20240613;

public class Test {
  public static void main(String[] args) {
    InheritB InheritB = new InheritB();

    InheritB.field2 = "필드2";
    InheritB.method2();

    InheritB.field1 = 100;
    InheritB.method1();

    Child child = new Child();

    child.save();
    child.invest();

    // 오버로딩 & 오버라이딩 설명 중!
    child.method1();
    child.method2();
    child.method3();

    Dog dog = new Dog(12);
    dog.setName("누룽지");
    dog.sleep(); // 함수가 어디 지정되어있는지 궁금하면 ctrl +b 하면됨
    dog.sleep(5);

    Student student = new Student("승조", "a", 1);

    student.say("하이");
    student.say();

    int r = 10;

    Computer computer = new Computer();
    System.out.println("원면적" + computer.areaCircle(r));
    computer.say();

    Calculator calculator = new Calculator();
    System.out.println("원면적" + calculator.areaCircle(r));
    System.out.println();

    SmartPhone smartPhone = new SmartPhone("김수민");
    smartPhone.turnOn();
    smartPhone.turnOff();
    smartPhone.internetSearch();

    //    Phone phone = new phone();  이게 왜 안되면 phone 클래스는 추상클래스라서 추상적이라서~! 안됨

  }
}
