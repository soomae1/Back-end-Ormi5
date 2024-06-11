package Ormi_java_20240611;

public class test {
  public static void main(String[] args) {
    // 외부클래스 가져와서 실행시키는 방법
    // 첫번 째 메서드 더하기 기능(파라미터는 정수 a, b를 받는다)
    // 두번 째 메서드 뺴기 기능(파라미터는 정수 a, b를 받는다)
    // test 클래스에서는 해당 기능을 호출 해서 메서드에 아규먼트로 임의의 값을 넣어서 메서드를 실행한다

    test2.call();
    test2 test2 = new test2();
    System.out.println(test2.add(1,2));
    System.out.println(test2.sub(1,2));
  }

/*  static void login(String email, String password) {
    // 로그인 기능을 만들거야 그때 이메일이랑 패스워드가 필요함! 그래서 파라미터로 넣음!

  }*/
}
