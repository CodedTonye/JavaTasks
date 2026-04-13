import java.util.Scanner;

public class DistanceCalculator {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the initial velocity (in meters/second): ");
	double u = input.nextDouble();

	System.out.print("Enter time span (in seconds): ");
	double t = input.nextDouble();

	System.out.print("Enter acceleration (in meters/second sqr): ");
	double a = input.nextDouble();

	double distance = (u * t) + (0.5 * a * t * t);
	
	System.out.print("The Distance covered is " + distance);	
	}
}