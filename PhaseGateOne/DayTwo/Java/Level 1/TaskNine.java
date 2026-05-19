import java.util.Scanner;

public class TaskNine {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter price of item: ");
        double price = inputCollector.nextDouble();
         
        double tax = 0.1;
        
        double taxedPrice = price * tax;
           
        double priceAfterTax = price + taxedPrice;
        
        System.out.printf("The price of item with tax is %.2f\n", priceAfterTax);
    }
}
