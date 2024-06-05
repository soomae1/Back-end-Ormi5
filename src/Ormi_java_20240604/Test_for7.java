package Ormi_java_20240604;

import java.sql.Array;
import java.util.Arrays;

public class Test_for7 {
  public static void main(String[] args) {
    int[] arr = new int[100];
    arr[0] = 1;
    arr[1] = 1;
    Arrays.setAll(arr, i -> (i < 2) ? 1 : arr[i - 1] + arr[i - 2]);
    System.out.println(arr[9]);
  }
}
