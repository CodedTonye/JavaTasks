import java.util.Scanner;

public class TaskTwenty {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Length: ");
	int length = input.nextInt();

	System.out.print("Enter Width: ");
	int width = input.nextInt();

	int area = length * width;

	System.out.printf("The Area is %d%n", area);

	}
}