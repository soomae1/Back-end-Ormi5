package Ormi_Java_20240619;

// 스택 실습

public class StackTest {
  public static void main(String[] args) {
    java.util.Stack<Coin> coinStack = new java.util.Stack<>();

    coinStack.push(new Coin(100));
    coinStack.push(new Coin(500));
    coinStack.push(new Coin(10));
    coinStack.push(new Coin(50));

    // 코인 스텍이 비어있지 않는동안
    while (!coinStack.isEmpty()) {
      Coin pop = coinStack.pop();
      System.out.println(pop.getValue());
    }
  }
}
