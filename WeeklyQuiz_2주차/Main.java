package WeeklyQuiz;

public class Main {
  public static void main(String[] args) {

    ShoppingMall mall = new PremiumShoppingMall(2);

    Product product = new Product("침대", 10000, 10);
    Product clothing = new Clothing("나이키티셔츠", 10000, 20, "L");
    Product electronics = new Electronics("노트북", 20000, 11, "Apple");
    Product food = new Food("우유", 2000, 10, 7);

    mall.addProduct(product);
    mall.addProduct(clothing);
    mall.addProduct(electronics);
    mall.addProduct(food);

    mall.displayProducts(); // 모든 상품의 정보가 다 나오게 하는 기능

    System.out.println("주문 가능 여부: " + mall.checkOrderAvailability());

    System.out.println("====================");

    mall.removeProduct(null, "노트북"); // 노트북 상품만 삭제 되는 기능
    mall.displayProducts();

    System.out.println("주문 가능 여부: " + mall.checkOrderAvailability());
  }
}
