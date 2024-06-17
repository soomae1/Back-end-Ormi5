package Ormi_Java_20240617.generic;

import java.util.ArrayList;

public class generic1 {
  public static void main(String[] args) {
    ArrayList<Animal> stringArrayList = new ArrayList<>();
    stringArrayList.add(new Lion());
    // <String> 이게 바로 제너릭임! 저 타입으로만 사용가능하다!
  }
}
