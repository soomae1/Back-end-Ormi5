package WeeklyQuiz;

public class Electronics extends Product {

  private String Brand;

  public Electronics(String Name, double Price, int Stock, String Brand) {
    super(Name, Price, Stock);
    this.Brand = Brand;
  }

  public String getBrand() {
    return Brand;
  }

  public void setBrand(String brand) {
    this.Brand = brand;
  }

  @Override
  public double calculatePrice() {
    if (Brand.equals("Apple")) {
      return getPrice() * 1.2;
    }
    return getPrice();
  }
}
