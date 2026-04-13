public class DiscountAmount {
  
    public static void main(String[] args) {

	double price = 50_000;

	double discountPercentage = 20;

	double discAmount = price * (discountPercentage / 100);

	double finalPrice = price - discAmount;

	System.out.printf("The Final Price after Discount is %.2f: ", finalPrice);
  }
}