package Quiz;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    BookShelf<String> bookShelf = new BookShelf<>();
    BookStack<Integer> bookStack = new BookStack<>();

    System.out.println("안녕하세요! 수민님 도서 정보를 입력해주세요 :D");
    System.out.print("책 제목: ");
    String title = scanner.nextLine();

    System.out.print("책 저자: ");
    String author = scanner.nextLine();

    // BookShelf String타입 식별자 정보 입력
    System.out.print("문자열 책 식별자: ");
    String shelfIdentifier = scanner.nextLine();

    // BookStack Integer타입 식별자 정보 입력
    System.out.print("정수형 책 식별자: ");
    Integer StackIdentifier = scanner.nextInt();
    scanner.nextLine();

    Book<String> shelfBook = new Book<>(title, author, shelfIdentifier);
    Book<Integer> stackBook = new Book<>(title, author, StackIdentifier);

    bookShelf.addBook(shelfBook);
    bookStack.pushBook(stackBook);

    // BookShelf 출력값
    System.out.println(" < 수민님이 도서 제목으로 검색한 결과 > ");
    for (Book<String> titleResults : bookShelf.searchByTitle(title)) {
      System.out.println(
          "제목: "
              + titleResults.getTitle()
              + ", 저자: "
              + titleResults.getAuthor()
              + ", 식별자: "
              + titleResults.getIdentifier());
    }

    System.out.println("=================================");

    System.out.println(" < 수민님이 도서 저자로 검색한 결과 > ");
    for (Book<String> authorResults : bookShelf.searchByAuthor(author)) {
      System.out.println(
          "제목: "
              + authorResults.getTitle()
              + ", 저자: "
              + authorResults.getAuthor()
              + ", 식별자: "
              + authorResults.getIdentifier());
    }

    System.out.println("=================================");

    // 도서 정보를 추가해서 맨 위에 있는 도서 정보 꺼내오기
    System.out.println("수민님! 추가 하려는 도서 정보를 입력해주세요 :D");
    System.out.print("책 제목: ");
    String addTitle = scanner.nextLine();

    System.out.print("책 저자: ");
    String addAuthor = scanner.nextLine();

    // BookStack Integer타입 식별자 정보 입력
    System.out.print("정수형 책 식별자: ");
    Integer addStackIdentifier = scanner.nextInt();

    Book<Integer> addStackBook = new Book<>(addTitle, addAuthor, addStackIdentifier);

    bookStack.pushBook(addStackBook);

    System.out.println("=================================");

    // BookStack 출력값
    System.out.println(" < 수민님이 꺼낸 도서 정보 > ");
    Book<Integer> poppedBook = bookStack.popBook();
    System.out.println(
        "제목: "
            + poppedBook.getTitle()
            + ", 저자: "
            + poppedBook.getAuthor()
            + ", 식별자: "
            + poppedBook.getIdentifier());

    System.out.println("=================================");

    System.out.println(" 도서가 비어있나요? : " + " (" + bookStack.isEmpty() + ") ");

    System.out.println("=================================");

    System.out.println(" < 맨 위에 있는 도서 정보 > ");
    Book<Integer> peekedBook = bookStack.peekBook();
    System.out.println(
        "제목: "
            + peekedBook.getTitle()
            + ", 저자: "
            + peekedBook.getAuthor()
            + ", 식별자: "
            + peekedBook.getIdentifier());

    scanner.close();
  }
}
