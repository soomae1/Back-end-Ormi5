package Ormi_Java_20240617;

public class KiaCar implements Car { // 그리고 기아는 카를 상속받는다 확장?
  @Override
  public String getTier() {
      return "이것은 기아 타이어입니다";
  }

  @Override
  public String showEngine() {
    return "이것은 기아 엔진입니다";
  }

  @Override
  public int amountNavi() {
    return 1000;
  }
}
