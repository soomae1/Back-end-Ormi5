package Ormi_java_20240603;

public class Test_Switch1 {
  public static void main(String[] args) {

    String day = "토요일";
    switch (day) {
      case "월요일":
        System.out.println("책읽기!");
        break;

      case "화요일":
        System.out.println("놀기");
        break;

      case "수요일":
        System.out.println("노래방가기");
        break;

      case "목요일":
        System.out.println("티비보기");
        break;

      case "금요일":
        System.out.println("영화보기");
        break;
      default:
        System.out.println("알 수 없는 요일");
        break;
    }
  }
}
