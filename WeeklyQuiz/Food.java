package WeeklyQuiz;

public class Food extends Product {

  private int expirationDate;

  public Food(String Name, double Price, int Stock, int expirationDate) {
    super(Name, Price, Stock);
    this.expirationDate = expirationDate;
  }

  public int getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(int expirationDate) {
    this.expirationDate = expirationDate;
  }

  @Override
  public double calculatePrice() {
    if (expirationDate <= 7) {
      return getPrice() * 0.8;
    }
    return getPrice();
  }
}
