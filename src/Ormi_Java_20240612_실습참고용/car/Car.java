package car;

public class Car {
  protected String company = "weniv";

  private int speed;

  private int gear;
  private String wheel;
  private int cc;
  private String logo;
  private String engine;

  public int getGear() {
    return gear;
  }

  public String getWheel() {
    return wheel;
  }

  public int getCc() {
    return cc;
  }

  public String getLogo() {
    return logo;
  }

  public String getEngine() {
    return engine;
  }

  public double getSpeed() {
    return this.speed * 1.6;
  }

  public void setGear(int gear) {
    this.gear = gear;
  }

  public void setWheel(String wheel) {
    this.wheel = wheel;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }



  public Car() {
    this.speed = speed;
    this.gear = gear;
  }

  public void setSpeed(int speed) {
//    this.speed = speed < 0 ? 0 : speed;

    if (speed < 0) { // 음수가 안되기 위해 방어코드 입력
      this.speed = 0;
      return;
    }
    this.speed = speed;


    if (speed <= 30) {
      this.gear = 1;
      System.out.println("현재 속도는" + this.speed + "이고, 기어는 " + this.gear+ "입니다.");
    } else if (speed <= 70) {
      this.gear = 2;
      System.out.println("현재 속도는" + this.speed + "이고, 기어는 " + this.gear+ "입니다.");
    } else {
      this.gear = 3;
      System.out.println("현재 속도는" + this.speed + "이고, 기어는 " + this.gear+ "입니다.");
    }
  }
}
