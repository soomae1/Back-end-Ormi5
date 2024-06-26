package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookShelf<T> implements BookManager<T> {

  private List<Book<T>> books;

  public BookShelf() {
    this.books = new ArrayList<>();
  }

  @Override
  public void addBook(Book<T> book) {
    books.add(book);
  }

  @Override
  public void removeBook(Book<T> book) {
    books.remove(book);
  }

  @Override
  public List<Book<T>> searchByTitle(String title) {
    return books.stream()
        .filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()))
        .collect(Collectors.toList());
  }

  @Override
  public List<Book<T>> searchByAuthor(String author) {
    return books.stream()
        .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()))
        .collect(Collectors.toList());
  }
}
