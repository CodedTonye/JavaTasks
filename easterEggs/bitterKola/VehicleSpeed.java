import java.util.Scanner;

public class VehicleSpeed {
  
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter speed km/h: ");
	int speed = input.nextInt();

	if (speed < 1) {
	    System.out.println("Stationary");
	} else if (speed < 41) {
	    System.out.println("Slow");
	} else if (speed < 81) {
	    System.out.println("Moderate");
	} else if (speed < 121) {
	    System.out.println("Fast");
	} else {
	    System.out.println("Dangerously Fast");
	}
  }
}