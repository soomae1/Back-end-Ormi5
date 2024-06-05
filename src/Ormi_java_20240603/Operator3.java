package Ormi_java_20240603;

public class Operator3 {
  public static void main(String[] args) {
    // && 연산자는 두개 다 true여야 true가 나옴!
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false);


    //or연산자 || 이걸로 표시하고 하나라도 true하면 값은 true이다!
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);

    // XOR 피연산자가 하나는 true이고 다른 하나는 false일 경우에만 결과가 true!
    // !는 논리부정연산자라 반대로 생각하면 됨! 잘 나오니까 알고있기!
    System.out.println(true ^ !true);
    System.out.println(true ^ false);
    System.out.println(false ^ true);
    System.out.println(false ^ false);

// x는 5보다 크고 13보다 작다.
// x > 5 && x <13

// i는 2의 배수 또는 3의 배수이다.
// i % 2 == 0 || i % 3 == 0;

// x는 30의 배수이면서 2의 배수이거나 5의 배수이다
// 30의 배수가 기준이라 () 괄호가 들어가야함 그리고
// || 이걸 먼저 하고 &&랑 맞춰야하기때문에 큰 괄호가 한번 더 들어간다
// x % 30 == 0 && x % 2 = 0 || x % 5 == 0;
// (x % 30 == 0) && ((x % 2 ==0 ) || (x%5==0))

  }
}
