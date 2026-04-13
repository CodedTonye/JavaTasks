import java.util.Scanner;

public class PinValidation {
  
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a 4-digit Pin: ");
	int number = input.nextInt();

	int pin = 1234;

	if (number == pin) {
	    System.out.println("Valid PIN.");
	} else {
	    System.out.println("Invalid PIN.");
	}
  }
}