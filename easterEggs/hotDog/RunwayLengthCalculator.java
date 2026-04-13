import java.util.Scanner;

public class RunwayLengthCalculator {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter take-off speed (m/s): ");
	double v = input.nextDouble();

	System.out.print("Enter acceleration (m/s sqr): ");
	double a = input.nextDouble();

	double length = (v * v) / (2 * a);

	System.out.printf("The minimum runway length needed is %.2f%n", length);
	}
}