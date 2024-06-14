public class Main {
  public static void main(String[] args) {
    try {
      MyCustomException();
    } catch (CustomException e) {
      System.out.println(e.getMessage());
    }
  }

  public static void MyCustomException() throws CustomException {
    System.out.println("커스텀 익셉션 오류 메세지입니닷");
  }
}
