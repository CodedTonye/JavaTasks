import java.util.Scanner;

public class TaskTwentySix {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your name: ");
	String name = input.nextLine();

	System.out.print("Enter your age: ");
	int age = input.nextInt();
	
	System.out.printf("I am %s and I am %d years old.", name, age);

	}
}