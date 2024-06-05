package Ormi_java_20240605;

import java.util.Random;

public class javaProgram2 {
  public static void main(String[] args) {
    Random random = new Random();

    int i = random.nextInt(8) + 1; // 0부터 8 전까지 양수로 나온다! +1을 하면 0은 나오지 않는다!!!

    System.out.println(i);
  }
}
