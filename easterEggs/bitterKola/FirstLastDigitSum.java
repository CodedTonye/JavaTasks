import java.util.Scanner;

public class FirstLastDigitSum {
  
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a 5-digit number: ");
	int number = input.nextInt();

	int digit1 = (number / 10000) % 10;
	int digit2 = (number / 1000) % 10;
	int digit3 = (number / 100) % 10;
	int digit4 = (number / 10) % 10;
	int digit5 = number % 10;

	int sum = digit1 + digit5;

	System.out.println("The sum of digit 1 and digit 5 is: " + sum);
  }
}