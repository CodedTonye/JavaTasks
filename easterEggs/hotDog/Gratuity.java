import java.util.Scanner;

public class Gratuity {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Subtotal: ");
	double subTotal = input.nextDouble();

	System.out.print("Enter Gratuity Rate: ");
	double gratuityRate1 = input.nextDouble();

	double gratuityRate = gratuityRate1 / 100;

	double gratuity = subTotal * gratuityRate;

	double total = subTotal + gratuity;
	
	System.out.printf("The Gratuity is %.1f while the Total is %.1f%n", gratuity, total);	
	}
}