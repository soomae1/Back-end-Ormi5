package WeeklyQuiz;

public class Clothing extends Product {

  private String Size;

  public Clothing(String Name, double Price, int Stock, String Size) {
    super(Name, Price, Stock);
    this.Size = Size;
  }

  public String getSize() {
    return Size;
  }

  public void setSize(String Size) {
    this.Size = Size;
  }

  @Override
  public double calculatePrice() {
    if (Size.equals("L") || Size.equals("XL") || Size.equals("XXL")) {
      return getPrice() * 1.1;
    }
    return getPrice();
  }
}
