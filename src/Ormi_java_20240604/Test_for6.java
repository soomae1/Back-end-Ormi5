package Ormi_java_20240604;

// 피보나치 배열을 만듭니다.
// int[] arr = new int[100]

public class Test_for6 {
  public static void main(String[] args) {
    long [] arr = new long [100];
    arr[0] = 1;
    arr[1] = 1;
    for (int i = 2; i < arr.length; i++) {
      arr[i] = arr[i - 2] + arr[i - 1];
      System.out.println(arr[i]);
    }
  }
}
