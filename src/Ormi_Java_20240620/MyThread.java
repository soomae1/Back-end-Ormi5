package Ormi_Java_20240620;

public class MyThread extends Thread {
  private String name;

  public MyThread(String name) {
    this.name = name;
  }

//  @Override
//  public void run() {
//    System.out.println("오늘 데일리 퀴즈는 10문제");
//    super.run();
//  }

  @Override
  public void run() {
    System.out.println(this.name);
    super.run();
  }
}
