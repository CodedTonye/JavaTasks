import java.util.Scanner;

public class FactorDeterminant {
  
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter Second Number: ");
	int secondNumber = input.nextInt();

	if (firstNumber <= 0 || secondNumber <= 0) {
	    System.out.println("Please enter positive integers only.");
	} else if (secondNumber % firstNumber == 0) {
	    System.out.println(firstNumber + " is a factor of " + secondNumber);
	} else {
	    System.out.printf(firstNumber + " is not a factor of " + secondNumber);
	}
  }
}