package Ormi_java_20240604;

public class Test_for_while5 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    // 변수를 만들어서 인덱스를 만들어서 접근하는 경우! 이걸 더 선호?
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    // 바로 데이터를 가져올 것이냐!
    for (int i : arr) {
      System.out.println(i);
    }
  }
}
