package Ormi_java_20240605;

// 추가한다 외부라이브러리에서 스캐너 가져다 쓸거야! CTRL + B 누르면 다른 창 넘어감!
// import java.util.Scanner; 스캐너에 알트 엔터 누르면 가져와짐!
// 실행해보면 실행 중 상태 런타임 / 정수를 입력하면 저장하고 코드가 종료된다!
// 정수를 입력 받으려고 무한 대기중인 상태~!
// 클로즈를 써주는게 좋다! 정수를 입력하면 종료되긴 하지만! 효율성 때문에 해주는거다?
// I/0 인풋 , 아웃풋

import java.util.Scanner; // 스캐너 클래스만 쓸거야! * 이거는 util 밑에 있는 클래스 다 가져와서 쓸거야 하지만 비효율적임!

public class java_Test2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("정수를 입력해주세요.");
    int a = sc.nextInt();

    System.out.println("제가 입력한 값은 " + a + " 입니다.");

    sc.close();
  }
}
