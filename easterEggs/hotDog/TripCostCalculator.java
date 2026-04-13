import java.util.Scanner;

public class  TripCostCalculator {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter distance to drive: ");
	double distance = input.nextDouble();

	System.out.print("Enter miles per gallon (MPG): ");
	double mpg = input.nextDouble();

	System.out.print("Enter price per gallon): ");
	double pricePerGallon = input.nextDouble();

	double costOfDriving = (distance / mpg) * pricePerGallon;

	System.out.printf("The Cost of driving is: %.2f%n", costOfDriving);
	}
}