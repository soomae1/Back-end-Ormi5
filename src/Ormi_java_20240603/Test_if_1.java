package Ormi_java_20240603;

public class Test_if_1 {
  public static void main(String[] args) {

    int a = 5;
    int b = 3;

    if (a > b) {
      System.out.println("a is greater than b");
    } else if (a == b) {
      System.out.println("a and b are equal");
    } else {
      System.out.println("a is less than b");
    }

    System.out.println((a > b)? "a is greater than b" : (a == b) ? "a and b are equal" : "a is less than b" );
//  System.out.println((a>b)?"a is greater than b":(a == b)?"a and b are equal":"a is less than b"); 강사님!

/*    int number = 10;

    if (number > 10) {
      System.out.println("number는 10보다 큽니다.");
    } else if (number < 10) {
      System.out.println("number는 10보다 작습니다.");
      if (number > 10) {
        System.out.println("number는 5보다 큽니다.");
      }
    } else {
      System.out.println("number는 10입니다.");*/
    }
  }

