import java.util.Scanner;

public class TaskTwentyFour {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter First Number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter Second Number: ");
	int secondNumber = input.nextInt();

	int swap = firstNumber;
 
	firstNumber = secondNumber;
	secondNumber = swap;

	
	System.out.printf("First Number = %d%nSecond Number = %d%n", firstNumber, secondNumber);

	}
}