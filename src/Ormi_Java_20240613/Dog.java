package Ormi_Java_20240613;

public class Dog extends Animal { // 도그 클래스(자식)가 애니몰 클래스(부모)를 상속받는다
  void sleep(int times) {
    System.out.println(name + "zzz..." + times + "hours");
  }

  public Dog(int age) { //dog는 실체 클래스 & 구현 클래스 animal은 추상 클래스
    super("상추", "남");
    // 이건 도그의 생성자가 없으며 생기는 거 눈에 보이지 않음
    // super: 상위클래스(부모), new animal(); 부모의 생성자를 이용해서 만든다!
    // 애니몰에서 생성자를 먼저 만들지 않고 여기서 생성자를 만들면 오류가 난다! (This.age =age;)

    this.kind = "포유류"; // 카인드는 애니몰 상속받아서 도그에서 사용가능
  }

  @Override // 빨간줄 누르고 ait + enter 누르면 알아서 추상메서드 만들어줌
  public void sound() {
    System.out.println("month month");
  }
}
