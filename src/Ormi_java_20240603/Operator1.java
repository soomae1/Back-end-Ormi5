package Ormi_java_20240603;

public class Operator1 {
  public static void main(String[] args) {
    int number1 = 10;
    int number2 = 3;

    int sum = number1 + number2;
    int diff1 = number2 - number1;
    int diff2 = number1 - number2;

    int product = number1 * number2;
    int quot = number1 / number2;
    int remainder = number1 % number2;

    System.out.println("덧셈" + sum);
    System.out.println("뺄셈1" + diff1);
    System.out.println("뺼셈2" + diff2);
    System.out.println("곱셈" + product);
    System.out.println("나눗셈" + quot);
    System.out.println("나머지" + remainder);
  }
}
