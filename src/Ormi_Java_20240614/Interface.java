package Ormi_Java_20240614;

public class Interface {
  public static void main(String[] args) {
    ZooKeeper zooKeeper = new ZooKeeper();

    Tiger tiger = new Tiger();
    zooKeeper.feed(tiger);

    Lion lion = new Lion();
    zooKeeper.feed(lion);

    Dear dear = new Dear();
    zooKeeper.feed2(dear);

    Rabbit rabbit = new Rabbit();
    zooKeeper.feed2(rabbit);
  }
}
