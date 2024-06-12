package Ormi_Java_20240612;

public class Test {
  public static void main(String[] args) {

    Person person1 = new Person("김수민", 26, "rabbit");
    Person person2 = new Person("문종건", 28, "dog");

    person1.sayhello();
    person1.introduce();
    System.out.println(" 내가 좋아하는 동물은 " + person1.animals + "야");

    person2.sayhello();
    person2.introduce();
    System.out.println();

    System.out.println(" 내 성별 : " + Person.GENDER);
    System.out.println(" 내 발사이즈 :  " + Person.FOOTSIZE);
    System.out.println(" 내가 쓰는 노트북: " + Person.NOTEBOOKNAME);
  }
}
