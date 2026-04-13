import java.util.Scanner;

public class TaskFourteen {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter Second Number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter Third Number: ");
	int thirdNumber = input.nextInt();

	int sum = firstNumber + secondNumber + thirdNumber;

	int average = sum / 3;

	System.out.printf("The Average is %d%n", average);

	}
}