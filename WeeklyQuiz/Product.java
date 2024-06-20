package WeeklyQuiz;

public class Product {
  private String Name;
  private double Price;
  private int Stock;

  public Product(String name, double price, int stock) {
    this.Name = name;
    this.Price = price;
    this.Stock = stock;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public double getPrice() {
    return Price;
  }

  public void setPrice(double price) {
    Price = price;
  }

  public int getStock() {
    return Stock;
  }

  public void setStock(int stock) {
    Stock = stock;
  }

  public double calculatePrice() {
    return Price;
  }
}
