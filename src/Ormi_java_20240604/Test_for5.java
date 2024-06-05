package Ormi_java_20240604;

public class Test_for5 {
  public static void main(String[] args) {
    for (int i = 100; i > 0; i--) {
      System.out.println(i);

      for (int x = 0; x >= -100; x--) {
        if (x % 2 == 0) {
          System.out.println(x);
        }
      }
    }
  }
}
