import java.util.Scanner;

public class  NonDecreasingIntegers {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Interger: ");
	int firstInteger = input.nextInt();

	System.out.print("Enter Second Integer: ");
	int secondInteger = input.nextInt();

	System.out.print("Enter Third Integer: ");
	int thirdInteger = input.nextInt();

	System.out.printf("%d%n%d%n%d%n", firstInteger, secondInteger, thirdInteger);
	}
}