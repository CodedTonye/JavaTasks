import java.util.Scanner;

public class TaskTwelve {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the First Number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter the Second Number: ");
	int secondNumber = input.nextInt();

	System.out.printf("The Inputted numbers are %d and %d%n", firstNumber, secondNumber);

	}
}