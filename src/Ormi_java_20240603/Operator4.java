package Ormi_java_20240603;

public class Operator4 {
  public static void main(String[] args) {
    //    int score = 95;
    //    char grade = (score > 90) ? 'A' : 'B';

    //    score는 95점이고, 5의 배수이면 "good" 아니라면 "bad"
    int score = 95;
    String grade = (score == 95 && score % 5 == 0) ? "good" : "bad";
    System.out.println(grade);

    if (score == 95 && score % 5 == 0) {
      System.out.println("good");
    } else {
      System.out.println("bad");
    }
  }
}
