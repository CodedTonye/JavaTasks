import java.util.Scanner;

public class SquareMetersToPingConverter {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Square Meters: ");
	double squareMeters = input.nextDouble();

	double ping = squareMeters * 0.3025;
	
	System.out.printf("The Square Meter to Ping is %.4f%n", ping);	
	}
}