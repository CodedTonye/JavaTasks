import java.util.Scanner;

public class TwoPointsDistance {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter points 1 (x1 y1): ");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();

	System.out.print("Enter points 2 (x2 y2): ");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();

	double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

	System.out.printf("The distance between (%.2f, %.2f) and (%.2f, %.2f) is %.2f%n", x1, y1, x2, y2, distance);
	}
}