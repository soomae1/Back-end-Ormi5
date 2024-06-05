package Ormi_java_20240603;

// if문 실습내용!

public class Test_if_2 {
  public static void main(String[] args) {
    // 변수 x에 10이 저장되어 있습니다. x가 양수인지, 음수인지, 아니면 0인지를 판별하는 코드를 작성하세요. (삼항연산자)
    int x = 10;

    if (x > 0) {
      System.out.println("양수");
    } else if (x == 0) {
      System.out.println("0");
    } else {
      System.out.println("음수");
    }

    System.out.println((x > 0) ? "양수" : (x == 0) ? "0" : "음수");

    // - 변수 score에 75가 저장되어 있습니다. score에 따라 학점을 출력하는 코드를 작성하세요.
    //  >= > + = 이렇게 치면됨
    //   - 90점 이상: A
    //    - 80점 이상 90점 미만: B
    //    - 70점 이상 80점 미만: C
    //    - 60점 이상 70점 미만: D
    //    - 60점 미만: F

    int score = 75;

    if (score >= 90) {
      System.out.println("A");
    } else if (score >= 80) {
      System.out.println("B");
    } else if (score >= 70) {
      System.out.println("C");
    } else if (score >= 60) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }

    // 변수 year에 2023이 저장되어 있습니다. year가 윤년인지 아닌지를 판별하는 코드를 작성하세요.
    // 윤년의 조건: 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수인 해
    // != ! + = 이렇게 치면됨

    int year = 2023;
    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
      System.out.println("윤년입니다.");
    }

    // 변수 a에 10, b에 20, c에 30이 저장되어 있습니다. 세 변수 중 가장 큰 값을 출력하는 코드를 작성하세요.

    int a = 10;
    int b = 20;
    int c = 30;

    if (a > b && a > c) {
      System.out.println("a가 제일 큽니다.");
    } else if (b > a && b > c) {
      System.out.println("b가 제일 큽니다.");
    } else {
      System.out.println("c가 제일 큽니다.");
    }

    // 변수 passScore에 60이 저장되어 있습니다. 변수 myScore에 75가 저장되어 있을 때,
    // myScore가 passScore 이상인지 판별하여 합격/불합격을 출력하는 코드를 작성하세요. (삼항연산자)

    int passScore = 60;
    int myScore = 75;

    if (myScore >= passScore) {
      System.out.println("합격드립니다!");
    } else {
      System.out.println("불합격드립니다!");
    }
    System.out.println((myScore >= passScore) ? "합격" : "불합격");
  }
}
