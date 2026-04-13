import java.util.Scanner;

public class TaskThirty {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter First Number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter Second Number: ");
	int secondNumber = input.nextInt();

	int sum = firstNumber + secondNumber;

	int product = firstNumber * secondNumber;
	
	System.out.printf("The Sum is %d and the Product is %d.%n", sum, product);

	}
}