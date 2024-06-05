package Ormi_Java_20240531;

public class Test {

  public static final String 입니다 = " 입니다";

  public static void main(String[] args) {
    String firstName = "SooMin Kim";
    String secondName = "SooMae";
    String phone = "apple iphone 12 pro";
    String Status = "tired";
    System.out.println("나는 " + secondName + " 그리고 " + firstName + "입니다");
    System.out.println("내 핸드폰은 " + phone + " 이고" + " 내 상태는 " + Status + "입니다");

    System.out.println(firstName.length());
    System.out.println(firstName.toUpperCase());
    System.out.println(firstName == secondName);
  }
}
