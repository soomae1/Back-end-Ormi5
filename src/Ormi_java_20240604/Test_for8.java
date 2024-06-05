package Ormi_java_20240604;

// for문에 있는 i를 밖에서 쓸 수 없음 그러나 방법이 있음! i가 for문이 아닌 위에 따로 있으면 밖에서 사용가능
// int i;
// for (i=0;i < 10; i++)
// 이렇게하면 for문 밖에서 사용가능!
// scope벗어난다...?

public class Test_for8 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
  }
}
