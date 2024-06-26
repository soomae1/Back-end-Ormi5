package WeeklyQuiz;

public class PremiumShoppingMall extends ShoppingMall {
  public PremiumShoppingMall(int size) {
    super(size);
  }

  @Override
  public boolean checkOrderAvailability() {
    for (int i = 0; i < productCount; i++) {
      if (products[i].getStock() < 10) {
        return false;
      }
    }
    return true;
  }
}
