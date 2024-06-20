package Ormi_Java_20240620;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
  public static void main(String[] args) throws InterruptedException {
    // 멀티스레드 만듬
    MyThread myThread = new MyThread("스레드1");
    MyThread myThread1 = new MyThread("스레드2");
    MyThread myThread2 = new MyThread("스레드3");
    MyThread myThread3 = new MyThread("스레드4");
    MyThread myThread4 = new MyThread("스레드5");

    myThread.start(); // 이걸 실행해서 런을 호출한다
    myThread1.start(); // 이렇게 호출하면 스레드가 순서대로 나오는게 아님!
    myThread2.start(); // 스레드는 동시에 다 호출되면 순차적으로 안됨
    myThread3.start(); // 스레드는 동시에 접근 가능! 순차적으로 하게 되면 동시성 이슈가 발생하게 되고 순서가 없이 막 해야 동시성 이슈 없음?
    myThread4.start();

    Thread thread1 = new Thread(new MyRunnable(1));
    Thread thread2 = new Thread(new MyRunnable(2));
    Thread thread3 = new Thread(new MyRunnable(3));
    Thread thread4 = new Thread(new MyRunnable(4));
    Thread thread5 = new Thread(new MyRunnable(5));

    thread1.start();
    thread2.start();
    thread3.start();
    Thread.sleep(10000); // 1000 1초 10000 10초 // 위에 값 나오고 잠깐 멈췄다가 밑에 나옴!
    thread4.start();
    thread5.start();

    // 람다 실습하기

    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    numbers.removeIf(
        (integer) -> integer % 2 == 0); // 람다식은 편리하지만 너무 막 쓰면 안됨 익명함수는 유추를 못함! 함수는 원래 유추할 수 있어야함
    System.out.println(numbers);

    for (Integer i : numbers) { // 이렇게도 사용되지만 위에 람다식으로도 표현가능
      if (i % 2 == 0) {
        numbers.remove(i);
      }
    }

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    callList(list);
  }

  public static void callList(List<Integer> integerList) {
    for (int i : integerList) {
      System.out.println(i);
    }
  }
}
