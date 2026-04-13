import java.util.Scanner;

public class TaskTwentyOne {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Base: ");
	int base = input.nextInt();

	System.out.print("Enter Height: ");
	int height = input.nextInt();

	int area = base * height * 1/2;

	System.out.printf("The Area of Triangle is %d%n", area);

	}
}