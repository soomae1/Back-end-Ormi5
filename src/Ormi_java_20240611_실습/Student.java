package Ormi_java_20240611_실습;


public class Student {
  int Level; // 멤버 변수(클래스 상태) / 변수는 생성자를 통해 초기화 하고 있음!(값을 받고있음)

  // 생성자
  // 뭘 받지 않고 1로 값을 줌!
  public Student() {
    this.Level = 1;
  }

  //메서드(기능)

  public void LevelUP() {
    Level++;
    System.out.println("레벨이 1증가 했습니다.");
    System.out.println("현재 레벨은 = " + Level + "입니다.");
  }

  public void LevelDown() {
    if (Level > 1) {
      Level--;
      System.out.println("레벨이 1감소 했습니다.");
      System.out.println("현재 레벨은 = " + Level + "입니다.");
    } else {
      System.out.println("더 이상 낮아질 수는 없습니다!");
    }
  }
}
