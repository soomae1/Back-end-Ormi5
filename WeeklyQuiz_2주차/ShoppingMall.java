package WeeklyQuiz;

public abstract class ShoppingMall {
  protected Product[] products;
  protected int productCount;

  public ShoppingMall(int size) {
    products = new Product[size];
    productCount = 0;
  }

  public void addProduct(Product product) {
    if (productCount == products.length) {
      resizeArray();
    }
    products[productCount++] = product;
  }

  private void resizeArray() {
    Product[] newProducts = new Product[products.length * 2];
    System.arraycopy(products, 0, newProducts, 0, products.length);
    products = newProducts;
  }

  public void removeProduct(Product product, String name) {
    for (int i = 0; i < productCount; i++) {
      if (products[i].getName().equals(name)) {
        for (int j = i; j < productCount - 1; j++) {
          products[j] = products[j + 1];
        }
        productCount--;
        if (product == products[i]) {
          break;
        }
      }
    }
  }

  public void displayProducts() {
    for (int i = 0; i < productCount; i++) {
      System.out.println(
          products[i].getName()
              + " 가격: "
              + products[i].calculatePrice()
              + " 원 , 재고 : "
              + products[i].getStock());
    }
  }

  public abstract boolean checkOrderAvailability();
}
