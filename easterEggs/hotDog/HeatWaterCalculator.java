import java.util.Scanner;

public class HeatWaterCalculator {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter amount of water in kilograms: ");
	double m = input.nextDouble();

	System.out.print("Enter the initial temperature: ");
	double initialTemperature = input.nextDouble();

	System.out.print("Enter the final temperature: ");
	double finalTemperature = input.nextDouble();

	double energy = m * (finalTemperature - initialTemperature) * 4184;
	
	System.out.printf("The energy needed to heat water from an initial temperature to a final temperature is %.2f%d", energy);	
	}
}